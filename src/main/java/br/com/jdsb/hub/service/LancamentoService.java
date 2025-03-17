package br.com.jdsb.hub.service;

import br.com.jdsb.hub.avro.LancamentoEvent;
import br.com.jdsb.hub.entity.LancamentoEntity;
import br.com.jdsb.hub.mapper.LancamentoMapper;
import br.com.jdsb.hub.repository.LancamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LancamentoService {

    private final LancamentoRepository repository;

    public void salvarLancamento(LancamentoEvent dto) {
        LancamentoEntity entity = LancamentoMapper.toEntity(dto);
        repository.save(entity);
    }
}
