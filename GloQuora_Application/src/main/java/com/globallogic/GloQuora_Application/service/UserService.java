package com.globallogic.GloQuora_Application.service;

import com.globallogic.GloQuora_Application.dto.InputUserDTO;
import com.globallogic.GloQuora_Application.model.User_Detail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User_Detail> getAllUsers();

    public User_Detail getUserById(String id);

    User_Detail addUser(InputUserDTO user);

    User_Detail updateUser(String id, InputUserDTO user) throws Exception;

    String deleteUser(String id);
}
