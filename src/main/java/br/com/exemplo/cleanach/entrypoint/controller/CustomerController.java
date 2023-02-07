package br.com.exemplo.cleanach.entrypoint.controller;

import br.com.exemplo.cleanach.core.dataprovider.FindAddressZipCode;
import br.com.exemplo.cleanach.core.usecase.DeleteCustomerUseCase;
import br.com.exemplo.cleanach.core.usecase.FindCustomerByIdUseCase;
import br.com.exemplo.cleanach.core.usecase.InsertCustomerUseCase;
import br.com.exemplo.cleanach.core.usecase.UpdateCustomerUseCase;
import br.com.exemplo.cleanach.entrypoint.controller.mapper.CustomerRequestMapper;
import br.com.exemplo.cleanach.entrypoint.controller.request.CustomerRequest;
import br.com.exemplo.cleanach.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final InsertCustomerUseCase insertCustomerUseCase;
    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final DeleteCustomerUseCase deleteCustomerUseCase;
    private final CustomerRequestMapper customerRequestMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        insertCustomerUseCase.insert(customerRequestMapper.toCustomer(request), request.getZipCode());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") final String id,
                                       @Valid @RequestBody CustomerRequest request) {
        var customer = customerRequestMapper.toCustomer(request);
        customer.setId(id);
        updateCustomerUseCase.update(customer, request.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final String id) {
        deleteCustomerUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> find(@PathVariable("id") final String id) {
        var customer = findCustomerByIdUseCase.find(id);
        return ResponseEntity.ok(customerRequestMapper.toCustomerResponse(customer));
    }
}
