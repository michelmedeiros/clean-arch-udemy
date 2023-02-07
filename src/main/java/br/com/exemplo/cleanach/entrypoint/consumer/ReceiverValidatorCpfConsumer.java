package br.com.exemplo.cleanach.entrypoint.consumer;

import br.com.exemplo.cleanach.core.usecase.UpdateCustomerUseCase;
import br.com.exemplo.cleanach.entrypoint.consumer.mapper.CustomerMessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;

@RequiredArgsConstructor
public class ReceiverValidatorCpfConsumer {

    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics= "tp-cpf-validated", groupId = "cleanarch")
    public void receiver(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
