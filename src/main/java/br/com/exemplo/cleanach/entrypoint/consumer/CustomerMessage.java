package br.com.exemplo.cleanach.entrypoint.consumer;

import br.com.exemplo.cleanach.core.domain.Address;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private String cpf;
    private String zipCode;
    private boolean isValidCpf;
}
