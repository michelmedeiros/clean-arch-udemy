package br.com.exemplo.cleanach.dataprovider;

import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.dataprovider.repository.CustomerRepository;
import br.com.exemplo.cleanach.dataprovider.repository.mapper.CustomerRepositoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerRepositoryMapper customerRepositoryMapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerRepositoryMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
