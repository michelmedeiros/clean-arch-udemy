package br.com.exemplo.cleanach.entrypoint.controller.mapper;

import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.entrypoint.controller.request.CustomerRequest;
import br.com.exemplo.cleanach.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CustomerRequestMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
