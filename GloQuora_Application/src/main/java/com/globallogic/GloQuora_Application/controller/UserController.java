package com.globallogic.GloQuora_Application.controller;

import com.globallogic.GloQuora_Application.dto.InputUserDTO;
import com.globallogic.GloQuora_Application.model.User_Detail;
import com.globallogic.GloQuora_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/showAll")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable("id") String id){
        return new ResponseEntity<>(service.getUserById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody InputUserDTO user){
        return new ResponseEntity<>(service.addUser(user), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateUser(@PathVariable("id") String id,@RequestBody InputUserDTO user) throws Exception {
        return new ResponseEntity<>(service.updateUser(id,user), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") String id){
        return new ResponseEntity<>(service.deleteUser(id), HttpStatus.OK);
    }

}
