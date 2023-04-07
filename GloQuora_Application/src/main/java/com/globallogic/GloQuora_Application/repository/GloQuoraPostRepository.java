package com.globallogic.GloQuora_Application.repository;

import com.globallogic.GloQuora_Application.model.GloQuora_Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GloQuoraPostRepository extends MongoRepository<GloQuora_Post,String> {
}
