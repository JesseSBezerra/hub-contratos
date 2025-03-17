package br.com.jdsb.hub.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "tbl_lancamento_contrato")
public class LancamentoEntity {

    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "clientId")
    private String clientId;

    @DynamoDBAttribute(attributeName = "clientSegmento")
    private String clientSegmento;

    @DynamoDBAttribute(attributeName = "valorLancamento")
    private Double valorLancamento;

    @DynamoDBAttribute(attributeName = "vencimentoLancamento")
    private String vencimentoLancamento;

    @DynamoDBAttribute(attributeName = "descontoLancamento")
    private Double descontoLancamento;

    @DynamoDBAttribute(attributeName = "jurosLancamento")
    private Double jurosLancamento;

    @DynamoDBAttribute(attributeName = "dataLancamento")
    private String dataLancamento;

    @DynamoDBAttribute(attributeName = "ativo")
    private Boolean ativo;

}