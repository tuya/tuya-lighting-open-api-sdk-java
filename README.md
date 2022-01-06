English | [简体中文](./README_cn.md)

# Tuya Commercial Lighting SaaS Open API SDK for Java

This SDK for Java allows you to quickly access the open APIs of Tuya's commercial lighting SaaS. You do not need to handle tasks such as signing and constructing your requests.

This topic describes how to install and use this SDK for Java.

If you have any questions in use, [submit an issue](https://github.com/tuya/tuya-lighting-open-api-sdk-java/issues/new).

## Prerequisites

- To use this SDK for Java, you must first create an account of Tuya's commercial lighting SaaS.
- Also, you must get an `AccessKey ID` and an `AccessKey Secret`. Create a project on the [Tuya IoT Development Platform](https://iot.tuya.com/cloud/) and view the **Authorization Key** on the details page of the project.

## Install dependency

If you put `lighting-open-api-java-sdk-{version}.jar` into the directory `${project.basedir}/lib`, you need to add the following dependencies to the `pom.xml` file. Otherwise, the error message `NoClassDefFoundError` will be returned.

```xml
<dependency>
    <groupId>com.tuya</groupId>
    <artifactId>lighting-open-api-java-sdk</artifactId>
    <version>{version}</version>
    <scope>system</scope>
    <systemPath>${project.basedir}/lib/lighting-open-api-java-sdk-{version}.jar</systemPath>
</dependency>
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.3</version>
</dependency>
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.68</version>
</dependency>
```

## Quick start

```java
public class Main {
    public static void main(String[]args){
        TuyaOpenApiConfiguration tuyaOpenApiConfiguration = new TuyaOpenApiConfiguration();
        tuyaOpenApiConfiguration.setUrl("https://openapi.tuyacn.com");
        tuyaOpenApiConfiguration.setClientId("****rgswael9wqsz****");
        tuyaOpenApiConfiguration.setClientSecret("****d09f429248caab6017554f93****");
        HttpClientUtils.setTuyaOpenApiConfiguration(tuyaOpenApiConfiguration);
        ProjectApi projectApi = new ProjectApi();
        TokenApi tokenApi = new TokenApi();
        BaseResponse<TokenResult> accessToken = tokenApi.getAccessToken(1);
        HttpClientUtils.setTokenResult(accessToken.getResult());
        BaseResponse<PageResult<ProjectListItem>> response = projectApi.page(1, 10, null);
    }
}
```

## Documentation

For more information about documentation, see [Tuya Open APIs for Commercial Lighting SaaS](https://developer.tuya.com/en/docs/iot/light?id=Ka65xlpme0eoz).

## Technical support

[Submit an issue](https://github.com/tuya/tuya-lighting-open-api-sdk-java/issues/new).

## License

The MIT license applies to this SDK for Java.
