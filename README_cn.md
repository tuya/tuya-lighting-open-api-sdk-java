[English](./README.md) | 简体中文

# 涂鸦商用照明 SaaS Open API Java SDK

涂鸦商用照明 SaaS Open API Java SDK，让用户更便捷地访问涂鸦商用照明 SaaS 的开放 API，让您不用处理如签名和构造请求等 API 相关的任务。

本文介绍了如何安装和使用涂鸦商用照明 SaaS Open API Java SDK。

如果您在使用涂鸦商用照明 SaaS Open API Java SDK 的过程中有任何问题，欢迎[提交 issue](https://github.com/tuya/tuya-lighting-open-api-sdk-java/issues/new)。

## 要求

- 要使用涂鸦商用照明 SaaS Open API Java SDK，您需要拥有涂鸦商用照明 SaaS 账号。
- 要使用涂鸦商用照明 SaaS Open API Java SDK，您需要拥有一对 `AccessKey ID` and an `AccessKey Secret`。请在 IoT 平台云开发控制台中创建和查看您的 AccessKey。

## 安装依赖

如果您将 `lighting-open-api-java-sdk-{version}.jar` 放入 `${project.basedir}/lib` 文件夹，您需要将以下依赖添加到 pom.xml 文件中，否则会抛出 NoClassDefFoundError 异常。
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

## 快速开始
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

## 文档
[涂鸦商用照明 SaaS Open API 文档](https://developer.tuya.com/en/docs/iot/light?id=Ka65xlpme0eoz)

## 技术支持
[提交 Issue](https://github.com/tuya/tuya-lighting-open-api-sdk-java/issues/new)

## 许可证
涂鸦商用照明 SaaS Open API Java SDK 使用 MIT License.