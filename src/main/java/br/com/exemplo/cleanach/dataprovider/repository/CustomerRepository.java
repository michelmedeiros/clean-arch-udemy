package br.com.exemplo.cleanach.dataprovider.repository;

import br.com.exemplo.cleanach.dataprovider.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
