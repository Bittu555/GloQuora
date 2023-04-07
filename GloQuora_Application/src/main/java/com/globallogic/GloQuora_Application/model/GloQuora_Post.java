package com.globallogic.GloQuora_Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Random;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "GloQuora_Post")
public class GloQuora_Post {
    @Id
    String post_id = UUID.randomUUID().toString();
    String userid;
    String title;
    String body;


}
