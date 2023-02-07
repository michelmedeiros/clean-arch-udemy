package br.com.exemplo.cleanach.core.dataprovider;

import br.com.exemplo.cleanach.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(String id);
}
