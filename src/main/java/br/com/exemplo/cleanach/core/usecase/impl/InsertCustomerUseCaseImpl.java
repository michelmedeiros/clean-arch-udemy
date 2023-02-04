package br.com.exemplo.cleanach.core.usecase.impl;

import br.com.exemplo.cleanach.core.dataprovider.FindAddressBZipCode;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.core.usecase.InsertCustomerUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {
    private final FindAddressBZipCode findAddressBZipCode;
    private final InsertCustomer insertCustomer;

    @Override
    public void insert(Customer customer, String zipcode) {
        var address = findAddressBZipCode.find(zipcode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
