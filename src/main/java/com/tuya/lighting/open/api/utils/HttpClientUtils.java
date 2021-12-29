package com.tuya.lighting.open.api.utils;


import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.stream.Collectors;

/**
 * HttpClientUtils
 *
 * @author lighting
 */
public class HttpClientUtils {

    private static final String ENCODING = "UTF-8";

    public static final int DEFAULT_CONNECT_TIMEOUT = 60000;

    public static final int DEFAULT_READ_TIMEOUT = 60000;

    public static final int DEFAULT_CONNECT_REQUEST_TIMEOUT = 60000;

    private static final int MAX_TOTAL = 64;

    private static final int MAX_PER_ROUTE = 32;

    private static RequestConfig requestConfig;
    private static CloseableHttpClient httpsClient;
    private static TuyaOpenApiConfiguration tuyaOpenApiConfiguration;
    private static TokenResult tokenResult;

    static {
        requestConfig = RequestConfig.custom()
                .setSocketTimeout(DEFAULT_READ_TIMEOUT)
                .setConnectTimeout(DEFAULT_CONNECT_TIMEOUT)
                .setConnectionRequestTimeout(DEFAULT_CONNECT_REQUEST_TIMEOUT)
                .build();
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(MAX_TOTAL);
        connectionManager.setDefaultMaxPerRoute(MAX_PER_ROUTE);
        HttpClientBuilder httpBuilder = HttpClientBuilder.create();
        httpBuilder.setDefaultRequestConfig(requestConfig);
        httpBuilder.setConnectionManager(connectionManager);
        httpsClient = httpBuilder.build();
    }

    public static String doGetWithToken(String url, Map<String, String> params, boolean withToken) {
        HttpGet httpGet = null;
        try {
            URIBuilder uriBuilder = new URIBuilder(tuyaOpenApiConfiguration.getUrl() + url);
            if (params != null) {
                Set<Map.Entry<String, String>> entrySet = params.entrySet();
                for (Map.Entry<String, String> entry : entrySet) {
                    uriBuilder.setParameter(entry.getKey(), entry.getValue());
                }
            }
            httpGet = new HttpGet(uriBuilder.build());
            httpGet.setConfig(requestConfig);
            setHeader(httpGet, withToken);
            return getHttpClientResult(httpsClient, httpGet);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpGet != null) {
                httpGet.releaseConnection();
            }
        }
        return null;
    }

    public static String doGet(String url, Map<String, String> params) {
        return doGetWithToken(url, params, true);
    }

    public static String doGetWithBody(String url, String json) {
        HttpGetWithEntity httpGetWithEntity = new HttpGetWithEntity(tuyaOpenApiConfiguration.getUrl() + url);
        httpGetWithEntity.setConfig(requestConfig);
        StringEntity stringEntity = new StringEntity(json, ENCODING);
        stringEntity.setContentEncoding(ENCODING);
        httpGetWithEntity.setEntity(stringEntity);
        setHeader(httpGetWithEntity, true);
        try {
            return getHttpClientResult(httpsClient, httpGetWithEntity);
        } finally {
            httpGetWithEntity.releaseConnection();
        }
    }

    @Deprecated
    public static String doPost(String url, Map<String, String> params) {
        HttpPost httpPost = new HttpPost(tuyaOpenApiConfiguration.getUrl() + url);
        httpPost.setConfig(requestConfig);
        setParam(params, httpPost);
        setHeader(httpPost, true);
        try {
            return getHttpClientResult(httpsClient, httpPost);
        } finally {
            httpPost.releaseConnection();
        }
    }

    public static String doPost(String url, String json) {
        HttpPost httpPost = new HttpPost(tuyaOpenApiConfiguration.getUrl() + url);
        httpPost.setConfig(requestConfig);
        StringEntity stringEntity = new StringEntity(json, ENCODING);
        stringEntity.setContentEncoding(ENCODING);
        httpPost.setEntity(stringEntity);
        setHeader(httpPost, true);
        try {
            return getHttpClientResult(httpsClient, httpPost);
        } finally {
            httpPost.releaseConnection();
        }
    }

    @Deprecated
    public static String doPut(String url, Map<String, String> params) {
        HttpPut httpPut = new HttpPut(tuyaOpenApiConfiguration.getUrl() + url);
        httpPut.setConfig(requestConfig);
        setParam(params, httpPut);
        setHeader(httpPut, true);
        try {
            return getHttpClientResult(httpsClient, httpPut);
        } finally {
            httpPut.releaseConnection();
        }
    }

    public static String doPut(String url, String json) {
        HttpPut httpPut = new HttpPut(tuyaOpenApiConfiguration.getUrl() + url);
        httpPut.setConfig(requestConfig);
        StringEntity stringEntity = new StringEntity(json, ENCODING);
        stringEntity.setContentEncoding(ENCODING);
        httpPut.setEntity(stringEntity);
        setHeader(httpPut, true);
        try {
            return getHttpClientResult(httpsClient, httpPut);
        } finally {
            httpPut.releaseConnection();
        }
    }

    public static String doDelete(String url) {
        HttpDelete httpDelete = new HttpDelete(tuyaOpenApiConfiguration.getUrl() + url);
        httpDelete.setConfig(requestConfig);
        setHeader(httpDelete, true);
        try {
            return getHttpClientResult(httpsClient, httpDelete);
        } finally {
            httpDelete.releaseConnection();
        }
    }

    public static void setHeader(HttpRequestBase httpMethod, boolean withToken) {
        long timestamp = System.currentTimeMillis();
        httpMethod.setHeader("Accept", "application/json");
        httpMethod.setHeader("sign_method", "HMAC-SHA256");
        httpMethod.setHeader("t", String.valueOf(timestamp));
        httpMethod.setHeader("client_id", tuyaOpenApiConfiguration.getClientId());
        httpMethod.setHeader("Signature-Headers", "");
        StringBuilder sb = new StringBuilder();
        sb.append(tuyaOpenApiConfiguration.getClientId());
        if (withToken) {
            httpMethod.setHeader("access_token", tokenResult.getAccessToken());
            sb.append(tokenResult.getAccessToken());
        }
        sb.append(timestamp);
        String strToSign = getStrToSign(httpMethod);
        sb.append(strToSign);
        httpMethod.setHeader("sign", SignUtils.sign(sb.toString(), tuyaOpenApiConfiguration.getClientSecret()));
    }

    public static void setParam(Map<String, String> params, HttpEntityEnclosingRequestBase httpMethod) {
        if (null != params && !params.isEmpty()) {
            List<NameValuePair> nvps = new ArrayList<>();
            Set<Map.Entry<String, String>> entrySet = params.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }

            UrlEncodedFormEntity entity = null;
            try {
                entity = new UrlEncodedFormEntity(nvps, ENCODING);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            httpMethod.setEntity(entity);
        }
    }

    public static String getHttpClientResult(CloseableHttpClient httpClient, HttpRequestBase httpMethod) {
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpMethod);
            if (httpResponse != null && httpResponse.getStatusLine() != null) {
                String content = null;
                if (httpResponse.getEntity() != null) {
                    content = EntityUtils.toString(httpResponse.getEntity(), ENCODING);
                }
                return content;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getStrToSign(HttpRequestBase httpMethod) {
        String method = httpMethod.getMethod();
        URI uri = httpMethod.getURI();
        String bodyHash = getBodyHash(httpMethod);

        String pathAndSortParam = "";
        try {
            pathAndSortParam = getPathAndSortParam(uri.toURL());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return method + "\n" + bodyHash + "\n" + "" + "\n" + pathAndSortParam;
    }

    private static String getBodyHash(HttpRequestBase httpMethod) {
        String bodyHash = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        if (httpMethod instanceof HttpEntityEnclosingRequestBase) {
            HttpEntityEnclosingRequestBase requestBase = (HttpEntityEnclosingRequestBase) httpMethod;
            StringEntity entity = (StringEntity) requestBase.getEntity();
            InputStream is = null;
            try {
                is = entity.getContent();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String body = null;
            if (is != null) {
                body = new BufferedReader(new InputStreamReader(is)).lines().collect(Collectors.joining(System.lineSeparator()));
            }
            if (body != null && body.length() > 0) {
                try {
                    bodyHash = SignUtils.encryption(body);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bodyHash;
    }

    public static String getPathAndSortParam(URL url) {
        try {
            // supported the query contains zh-Han char
            String query = URLDecoder.decode(url.getQuery(), "UTF-8");
            String path = url.getPath();
            if (isBlank(query)) {
                return path;
            }
            Map<String, String> kvMap = new TreeMap<>();
            String[] kvs = query.split("\\&");
            for (String kv : kvs) {
                String[] kvArr = kv.split("=");
                if (kvArr.length > 1) {
                    kvMap.put(kvArr[0], kvArr[1]);
                } else {
                    kvMap.put(kvArr[0], "");
                }
            }
            return path + "?" + kvMap.entrySet().stream().map(it -> it.getKey() + "=" + it.getValue())
                    .collect(Collectors.joining("&"));
        } catch (Exception e) {
            return url.getPath();
        }
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static TuyaOpenApiConfiguration getTuyaOpenApiConfiguration() {
        return tuyaOpenApiConfiguration;
    }

    public static void setTuyaOpenApiConfiguration(TuyaOpenApiConfiguration tuyaOpenApiConfiguration) {
        HttpClientUtils.tuyaOpenApiConfiguration = tuyaOpenApiConfiguration;
    }

    public static TokenResult getTokenResult() {
        return tokenResult;
    }

    public static synchronized void setTokenResult(TokenResult tokenResult) {
        HttpClientUtils.tokenResult = tokenResult;
    }

    public static class HttpGetWithEntity extends HttpEntityEnclosingRequestBase {
        public static final String METHOD_NAME = "GET";

        public HttpGetWithEntity(String url) {
            this.setURI(URI.create(url));
        }

        @Override
        public String getMethod() {
            return "GET";
        }
    }
}

