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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Objeto de resposta para o número da proposta.
 */
@ApiModel(description = "Objeto de resposta para o número da proposta.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T19:02:41.259Z")
public class InclusaoPrePropostaResponse {
  @SerializedName("numero")
  private String numero = null;

  public InclusaoPrePropostaResponse numero(String numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Número da proposta.
   * @return numero
  **/
  @ApiModelProperty(value = "Número da proposta.")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InclusaoPrePropostaResponse inclusaoPrePropostaResponse = (InclusaoPrePropostaResponse) o;
    return Objects.equals(this.numero, inclusaoPrePropostaResponse.numero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InclusaoPrePropostaResponse {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

