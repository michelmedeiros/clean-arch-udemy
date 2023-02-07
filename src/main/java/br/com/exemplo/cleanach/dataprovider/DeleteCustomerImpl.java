package br.com.exemplo.cleanach.dataprovider;

import br.com.exemplo.cleanach.core.dataprovider.DeleteCustomer;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.dataprovider.repository.CustomerRepository;
import br.com.exemplo.cleanach.dataprovider.repository.mapper.CustomerRepositoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class DeleteCustomerImpl implements DeleteCustomer {

    private final CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
