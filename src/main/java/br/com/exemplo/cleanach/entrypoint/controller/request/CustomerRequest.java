package br.com.exemplo.cleanach.entrypoint.controller.request;

import br.com.exemplo.cleanach.core.domain.Address;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;
}
