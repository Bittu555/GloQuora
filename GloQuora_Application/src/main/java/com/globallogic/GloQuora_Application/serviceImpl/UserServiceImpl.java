package com.globallogic.GloQuora_Application.serviceImpl;

import com.globallogic.GloQuora_Application.dto.InputUserDTO;
import com.globallogic.GloQuora_Application.model.General_User;
import com.globallogic.GloQuora_Application.model.Premium_User;
import com.globallogic.GloQuora_Application.model.User_Detail;
import com.globallogic.GloQuora_Application.repository.UserRepository;
import com.globallogic.GloQuora_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User_Detail> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User_Detail getUserById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public User_Detail addUser(InputUserDTO user) {
        User_Detail newUser = new User_Detail();
        newUser.setName(user.getName());
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        newUser.setPhone(user.getPhone());
        newUser.setAddress(user.getAddress());
        newUser.setGeo(user.getGeo());
        newUser.setCompany(user.getCompany());
        if(user.getUserType().equalsIgnoreCase("premium")){
            newUser.setUser(new Premium_User("Premium", user.getPremiumAmount(), user.getValidity()));
        }
        else{
            newUser.setUser(new General_User("General", user.getPremiumAmount(), user.getValidity()));
        }
        return repository.save(newUser);
    }

    @Override
    public User_Detail updateUser(String id, InputUserDTO user) throws Exception {
        if(repository.findById(id).isPresent()){
            User_Detail newUser = repository.findById(id).get();
            newUser.setName(user.getName());
            newUser.setUsername(user.getUsername());
            newUser.setEmail(user.getEmail());
            newUser.setPhone(user.getPhone());
            newUser.setAddress(user.getAddress());
            newUser.setGeo(user.getGeo());
            newUser.setCompany(user.getCompany());
            if(user.getUserType().equalsIgnoreCase("premium")){
                newUser.setUser(new Premium_User("Premium", user.getPremiumAmount(), user.getValidity()));
            }
            else{
                newUser.setUser(new General_User("General", user.getPremiumAmount(), user.getValidity()));
            }

            return repository.save(newUser);
        }
        throw new Exception("User id Invalid!!!");
    }

    @Override
    public String deleteUser(String id) {
        try{
            repository.deleteById(id);
            return "Deleted Successfully";
        }
        catch(Exception e){
            return "Invalid Id";
        }
    }
}
