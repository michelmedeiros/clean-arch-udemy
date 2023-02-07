package br.com.exemplo.cleanach.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends MongoRepository<AddressRepository, String> {
}
