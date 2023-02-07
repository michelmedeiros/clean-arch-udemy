package br.com.exemplo.cleanach.entrypoint.consumer.mapper;

import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.entrypoint.consumer.CustomerMessage;
import br.com.exemplo.cleanach.entrypoint.controller.request.CustomerRequest;
import br.com.exemplo.cleanach.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CustomerMessageMapper {
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}