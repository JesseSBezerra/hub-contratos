package br.com.jdsb.hub.mapper;

import br.com.jdsb.hub.avro.LancamentoEvent;
import br.com.jdsb.hub.entity.LancamentoEntity;

public class LancamentoMapper {

public static LancamentoEntity toEntity(LancamentoEvent lancamento) {
        LancamentoEntity entity = new LancamentoEntity();
        entity.setId(lancamento.getId().toString());
        entity.setClientId(lancamento.getClientId().toString());
        entity.setClientSegmento(lancamento.getClientSegmento().toString());
        entity.setValorLancamento(lancamento.getValorLancamento());
        entity.setVencimentoLancamento(lancamento.getVencimentoLancamento().toString());
        entity.setDescontoLancamento(lancamento.getDescontoLancamento());
        entity.setJurosLancamento(lancamento.getJurosLancamento());
        entity.setDataLancamento(lancamento.getDataLancamento().toString());
        entity.setAtivo(true);
        return entity;
    }

}
