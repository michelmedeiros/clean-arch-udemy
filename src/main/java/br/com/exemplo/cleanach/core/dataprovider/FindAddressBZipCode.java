package br.com.exemplo.cleanach.core.dataprovider;

import br.com.exemplo.cleanach.core.domain.Address;

public interface FindAddressBZipCode {
    Address find(final String zipCode);
}
