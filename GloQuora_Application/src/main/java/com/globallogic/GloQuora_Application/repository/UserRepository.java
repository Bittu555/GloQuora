package com.globallogic.GloQuora_Application.repository;

import com.globallogic.GloQuora_Application.model.User_Detail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User_Detail,String> {

}
