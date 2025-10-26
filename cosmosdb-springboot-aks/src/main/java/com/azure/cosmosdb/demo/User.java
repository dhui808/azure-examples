package com.azure.cosmosdb.demo;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
@Container(containerName = "users")
public class User {
    @Id
    @PartitionKey
    private String email;
    private String firstName;
    private String lastName;
    private String city;


    @Override
    public String toString() {
        return "User [city=" + city + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}