package br.com.exemplo.cleanach.core.usecase;

import br.com.exemplo.cleanach.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(String id);
}
