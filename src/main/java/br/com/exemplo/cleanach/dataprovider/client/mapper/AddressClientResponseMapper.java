package br.com.exemplo.cleanach.dataprovider.client.mapper;

import br.com.exemplo.cleanach.core.domain.Address;
import br.com.exemplo.cleanach.dataprovider.client.response.AddressClientResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AddressClientResponseMapper {
    @Mapping(target = "id", ignore = true)
    Address toAddress(AddressClientResponse addressResponse);
}
