package com.globallogic.GloQuora_Application.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor@NoArgsConstructor@Data
//@Document(value = "General_User")
public class General_User implements User{
    String type;
    double premiumAmount;
    int validity;
}
