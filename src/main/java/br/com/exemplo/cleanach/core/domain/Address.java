package br.com.exemplo.cleanach.core.domain;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String state;
    private String country;
    private String city;
}
