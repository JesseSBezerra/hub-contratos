package br.com.jdsb.hub.consumer;


import br.com.jdsb.hub.avro.LancamentoEvent;
import br.com.jdsb.hub.service.LancamentoService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LancamentoConsumer {

    @Autowired
    private LancamentoService lancamentoService;

    @KafkaListener(topics = "${hub.consumer.kafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, LancamentoEvent> record) {
        var event = record.value();
        System.out.println("### CONSUMIDO: " + event);
        lancamentoService.salvarLancamento(event);
        // aqui você pode salvar no banco, logar, transformar, etc
    }
}
