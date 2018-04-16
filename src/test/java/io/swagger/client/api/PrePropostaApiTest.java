/*
 * Gestão de Propostas
 * API de Gestão de Propostas.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InclusaoPrePropostaResponse;
import io.swagger.client.model.PreProposta;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrePropostaApi
 */
@Ignore
public class PrePropostaApiTest {

    private final PrePropostaApi api = new PrePropostaApi();

    
    /**
     * 
     *
     * Esta API tem o objetivo de incluir uma análise de dados sobre uma pré-proposta de crédito. Caso o cliente já possua uma proposta em andamento, ou qualquer outra inconsistência na inclusão, o sistema irá retornar um código de erro informando o motivo. Caso seja aprovada, uma proposta será incluída.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prePropostasPostTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        byte[] xAuthorization = null;
        String codigoLoja = null;
        String codigoLojista = null;
        PreProposta preProposta = null;
        InclusaoPrePropostaResponse response = api.prePropostasPost(clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, preProposta);

        // TODO: test validations
    }
    
}
