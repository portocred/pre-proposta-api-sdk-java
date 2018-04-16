# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PrePropostaApi;

import java.io.File;
import java.util.*;

public class PrePropostaApiExample {

    public static void main(String[] args) {
        
        PrePropostaApi apiInstance = new PrePropostaApi();
        String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
        String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
        byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
        String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
        String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
        PreProposta preProposta = new PreProposta(); // PreProposta | Pré-Proposta a ser analisada, cujo resultado, quando aprovada é uma proposta.
        try {
            InclusaoPrePropostaResponse result = apiInstance.prePropostasPost(clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, preProposta);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrePropostaApi#prePropostasPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dev-api.portocred.com.br/gestao-proposta/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PrePropostaApi* | [**prePropostasPost**](docs/PrePropostaApi.md#prePropostasPost) | **POST** /pre-propostas | 


## Documentation for Models

 - [Candidato](docs/Candidato.md)
 - [InclusaoPrePropostaResponse](docs/InclusaoPrePropostaResponse.md)
 - [PreProposta](docs/PreProposta.md)
 - [TipoSeguro](docs/TipoSeguro.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



