package br.com.exemplo.cleanach.dataprovider.repository.mapper;

import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.dataprovider.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CustomerRepositoryMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toConsumer(CustomerEntity customerEntity);
}
