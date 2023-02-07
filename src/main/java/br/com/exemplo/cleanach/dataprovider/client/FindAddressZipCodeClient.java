package br.com.exemplo.cleanach.dataprovider.client;

import br.com.exemplo.cleanach.dataprovider.client.response.AddressClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressZipCode", url = "${gateway.client.address.url}")
public interface FindAddressZipCodeClient {
    @GetMapping("/{zipcode}")
    AddressClientResponse findAddress(@PathVariable("zipcode") String zipCode);
}
