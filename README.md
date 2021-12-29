English | [简体中文](./README_cn.md)

## Tuya Lighting SaaS Open API Java SDK

This Java SDK for Tuya Lighting SaaS Open API allows you to access Tuya Lighting SaaS Open API easily. You can access Tuya Lighting SaaS Open API without the need to handle API related tasks, such as signing and constructing your requests.

This document introduces how to obtain and call Tuya Lighting SaaS Open API Java SDK.

If you have any problem while using Tuya Lighting SaaS Open API Java SDK, please [submit an issue](https://github.com/tuya/tuya-lighting-open-api-sdk-java/issues/new).

## Requirement

- To use Tuya Lighting SaaS Open API Java SDK, you must have a Tuya Lighting SaaS account
- To use Tuya Lighting SaaS Open API Java SDK, you must have an `AccessKey ID` and an `AccessKey Secret`. Create and view your AccessKey on [IoT core console](https://iot.tuya.com/cloud/)

## Installation

If you put `lighting-open-api-java-sdk-{version}.jar` in folder `${project.basedir}/lib`, you need to add these dependencies in the pom.xml file, or a NoClassDefFoundError exception will be reported.
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

## Quick Start
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
[Tuya Lighting SaaS Open API Doc](https://developer.tuya.com/en/docs/iot/light?id=Ka65xlpme0eoz)

## Support
[Opening an Issue](https://github.com/tuya/tuya-lighting-open-api-sdk-java/issues/new)

## License
This Tuya Lighting SaaS Open API Java SDK is licensed under the MIT License.