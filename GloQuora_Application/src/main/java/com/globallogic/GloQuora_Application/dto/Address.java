package com.globallogic.GloQuora_Application.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor@NoArgsConstructor@Data
//@Document(collection = "Address")
public class Address {
//    @Id
//    String addressId = UUID.randomUUID().toString();
    String street;
    String city;
}
