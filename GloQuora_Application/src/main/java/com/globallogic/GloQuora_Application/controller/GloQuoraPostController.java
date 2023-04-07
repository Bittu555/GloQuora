package com.globallogic.GloQuora_Application.controller;

import com.globallogic.GloQuora_Application.dto.InputPostDTO;
import com.globallogic.GloQuora_Application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class GloQuoraPostController {

    @Autowired
    PostService service;

    @GetMapping("/showAll")
    public ResponseEntity getAllPosts(){
        return new ResponseEntity<>(service.getAllPosts(), HttpStatus.OK);
    }

    @PostMapping("/add/{id}")
    public ResponseEntity addPost(@PathVariable("id") String userId,@RequestBody InputPostDTO postDTO){
        return new ResponseEntity<>(service.addPost(userId,postDTO), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updatePost(@PathVariable("id") String id,@RequestBody InputPostDTO postDTO){
        return new ResponseEntity<>(service.updatePost(id,postDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity getAllPosts(@PathVariable("id") String id){
        return new ResponseEntity<>(service.deletePost(id), HttpStatus.OK);
    }

}
