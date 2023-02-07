package br.com.exemplo.cleanach.core.usecase.impl;

import br.com.exemplo.cleanach.core.dataprovider.DeleteCustomer;
import br.com.exemplo.cleanach.core.dataprovider.FindAddressZipCode;
import br.com.exemplo.cleanach.core.dataprovider.FindCustomerById;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.core.usecase.DeleteCustomerUseCase;
import br.com.exemplo.cleanach.core.usecase.FindCustomerByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerUseCase {
    private final FindCustomerByIdUseCase findCustomerById;
    private final DeleteCustomer deleteCustomer;


    @Override
    public void delete(String id) {
        var customer = findCustomerById.find(id);
        deleteCustomer.delete(customer.getId());
    }
}
