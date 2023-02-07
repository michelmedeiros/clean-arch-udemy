package br.com.exemplo.cleanach.core.usecase.impl;

import br.com.exemplo.cleanach.core.dataprovider.FindAddressZipCode;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.dataprovider.UpdateCustomer;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.core.usecase.FindCustomerByIdUseCase;
import br.com.exemplo.cleanach.core.usecase.InsertCustomerUseCase;
import br.com.exemplo.cleanach.core.usecase.UpdateCustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {
    private final FindAddressZipCode findAddressBZipCode;
    private final UpdateCustomer updateCustomer;

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Override
    public void update(Customer customer, String zipcode) {
        var customerFind = findCustomerByIdUseCase.find(customer.getId());
        if(customerFind != null) {
            var address = findAddressBZipCode.find(zipcode);
            customer.setAddress(address);
            updateCustomer.update(customer);
        }
    }
}
