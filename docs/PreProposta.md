
# PreProposta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operador** | **String** | Identificação do operador. |  [optional]
**codigoProduto** | **String** | Código do produto. Pelo Produto se descobre também a família de produto. |  [optional]
**valorCompra** | **Double** | Valor da compra sem entrada (neste caso valor da prestação &#x3D; zero). |  [optional]
**valorPrestacao** | **Double** | Valor da PMT a (neste caso valor da compra &#x3D; zero/ valor da entrada &#x3D; 0). |  [optional]
**prazoPagamento** | **String** | Prazo de pagamento. |  [optional]
**tipoSeguro** | [**TipoSeguro**](TipoSeguro.md) |  |  [optional]
**dataVencimentoPrimeiraParcela** | [**LocalDate**](LocalDate.md) | Data de vencimento da 1ª parcela. Verificar se está coerente com a Carência mínima e máxima combinada com a financeira (dd-mm-aaaa). |  [optional]
**candidato** | [**Candidato**](Candidato.md) |  |  [optional]



