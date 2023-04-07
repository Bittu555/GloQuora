package com.globallogic.GloQuora_Application.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Document(collection = "Geo")
public class Geo {
    String geoId = UUID.randomUUID().toString();
    String latitude;
    String longitude;
}
