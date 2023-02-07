package br.com.exemplo.cleanach.dataprovider;

import br.com.exemplo.cleanach.core.dataprovider.FindCustomerById;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.dataprovider.repository.CustomerRepository;
import br.com.exemplo.cleanach.dataprovider.repository.mapper.CustomerRepositoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
public class FindCustomerByIdImpl implements FindCustomerById {

    private final CustomerRepository customerRepository;
    private final CustomerRepositoryMapper customerRepositoryMapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerRepositoryMapper::toConsumer);
    }
}
