package br.com.exemplo.cleanach.core.usecase.impl;

import br.com.exemplo.cleanach.core.dataprovider.FindAddressZipCode;
import br.com.exemplo.cleanach.core.dataprovider.FindCustomerById;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.core.usecase.FindCustomerByIdUseCase;
import br.com.exemplo.cleanach.core.usecase.InsertCustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {
    private final FindCustomerById findCustomerById;

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(NoSuchElementException::new);
    }
}
