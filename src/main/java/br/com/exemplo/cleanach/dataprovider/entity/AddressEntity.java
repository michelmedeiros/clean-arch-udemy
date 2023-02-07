package br.com.exemplo.cleanach.dataprovider.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "addresses")
public class AddressEntity {
    @Id
    private String id;
    private String street;
    private String state;
    private String country;
    private String city;
}
