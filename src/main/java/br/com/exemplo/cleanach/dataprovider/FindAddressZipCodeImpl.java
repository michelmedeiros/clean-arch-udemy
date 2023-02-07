package br.com.exemplo.cleanach.dataprovider;

import br.com.exemplo.cleanach.core.dataprovider.FindAddressZipCode;
import br.com.exemplo.cleanach.core.domain.Address;
import br.com.exemplo.cleanach.dataprovider.client.FindAddressZipCodeClient;
import br.com.exemplo.cleanach.dataprovider.client.mapper.AddressClientResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class FindAddressZipCodeImpl implements FindAddressZipCode {

    @Autowired
    private FindAddressZipCodeClient findAddressZipCodeClient;
    private AddressClientResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        return addressResponseMapper.toAddress(
                findAddressZipCodeClient.findAddress(zipCode));
    }
}
