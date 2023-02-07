package br.com.exemplo.cleanach.entrypoint.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {
    private String id;
    private String name;
    private String cpf;
    private AddressResponse address;
    private boolean isValidCpf;
}
