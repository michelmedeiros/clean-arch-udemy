package br.com.exemplo.cleanach.core.usecase.impl;

import br.com.exemplo.cleanach.core.dataprovider.FindAddressZipCode;
import br.com.exemplo.cleanach.core.dataprovider.InsertCustomer;
import br.com.exemplo.cleanach.core.dataprovider.SendCpfForValidator;
import br.com.exemplo.cleanach.core.domain.Customer;
import br.com.exemplo.cleanach.core.usecase.InsertCustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {
    private final FindAddressZipCode findAddressBZipCode;
    private final InsertCustomer insertCustomer;
    private final SendCpfForValidator sendCpfForValidator;

    @Override
    public void insert(Customer customer, String zipcode) {
        var address = findAddressBZipCode.find(zipcode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidator.send(customer.getCpf());
    }
}
