package com.globallogic.GloQuora_Application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Document(collection = "Company")
public class Company {
//    @Id
//    String companyId = UUID.randomUUID().toString();
    String name;
    String location;
}
