package com.globallogic.GloQuora_Application.dto;

import com.globallogic.GloQuora_Application.model.General_User;
import com.globallogic.GloQuora_Application.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor@NoArgsConstructor@Data
public class InputUserDTO {
    String name;
    String username;
    String email;
    String phone;
    Address address;
    Geo geo;
    Company company;
    String userType;
    double premiumAmount;
    int validity;
}
