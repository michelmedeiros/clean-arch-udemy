package br.com.exemplo.cleanach.dataprovider.client.response;

import lombok.Data;

@Data
public class AddressClientResponse {
    private String street;
    private String state;
    private String country;
    private String city;
}
