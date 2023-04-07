package com.globallogic.GloQuora_Application.model;

import com.globallogic.GloQuora_Application.dto.Address;
import com.globallogic.GloQuora_Application.dto.Company;
import com.globallogic.GloQuora_Application.dto.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(value = "User_Details")
public class User_Detail {
    @Id
    String userId = UUID.randomUUID().toString();
    String name;
    String username;
    String email;
    String phone;

    Address address;

    Geo geo;
    Company company;
    User user;

}
