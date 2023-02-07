package br.com.exemplo.cleanach.entrypoint.controller.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String street;
    private String state;
    private String country;
    private String city;
}
