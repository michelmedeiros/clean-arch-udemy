package br.com.exemplo.cleanach.core.usecase;

import br.com.exemplo.cleanach.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String cep);
}
