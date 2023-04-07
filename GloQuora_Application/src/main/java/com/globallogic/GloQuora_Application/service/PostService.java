package com.globallogic.GloQuora_Application.service;

import com.globallogic.GloQuora_Application.dto.InputPostDTO;
import com.globallogic.GloQuora_Application.model.GloQuora_Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<GloQuora_Post> getAllPosts();

    GloQuora_Post addPost(String userId ,InputPostDTO postDTO);

    GloQuora_Post updatePost(String id, InputPostDTO postDTO);

    String deletePost(String id);
}
