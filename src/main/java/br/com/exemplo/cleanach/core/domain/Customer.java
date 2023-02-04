package br.com.exemplo.cleanach.core.domain;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String name;
    private String cpf;
    private Address address;
    private boolean isValidCpf;
}
