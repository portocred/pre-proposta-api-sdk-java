# PrePropostaApi

All URIs are relative to *https://dev-api.portocred.com.br/gestao-proposta/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**prePropostasPost**](PrePropostaApi.md#prePropostasPost) | **POST** /pre-propostas | 


<a name="prePropostasPost"></a>
# **prePropostasPost**
> InclusaoPrePropostaResponse prePropostasPost(clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, preProposta)



Esta API tem o objetivo de incluir uma análise de dados sobre uma pré-proposta de crédito. Caso o cliente já possua uma proposta em andamento, ou qualquer outra inconsistência na inclusão, o sistema irá retornar um código de erro informando o motivo. Caso seja aprovada, uma proposta será incluída.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrePropostaApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **preProposta** | [**PreProposta**](PreProposta.md)| Pré-Proposta a ser analisada, cujo resultado, quando aprovada é uma proposta. |

### Return type

[**InclusaoPrePropostaResponse**](InclusaoPrePropostaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

