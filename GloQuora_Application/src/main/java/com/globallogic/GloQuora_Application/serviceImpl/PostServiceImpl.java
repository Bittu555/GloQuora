package com.globallogic.GloQuora_Application.serviceImpl;

import com.globallogic.GloQuora_Application.dto.InputPostDTO;
import com.globallogic.GloQuora_Application.model.GloQuora_Post;
import com.globallogic.GloQuora_Application.repository.GloQuoraPostRepository;
import com.globallogic.GloQuora_Application.repository.UserRepository;
import com.globallogic.GloQuora_Application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    GloQuoraPostRepository repository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<GloQuora_Post> getAllPosts() {
        return repository.findAll();
    }

    @Override
    public GloQuora_Post addPost(String id, InputPostDTO postDTO) {
        if (!userRepository.findById(id).isPresent()) return null;

        GloQuora_Post newPost = new GloQuora_Post();
        newPost.setTitle(postDTO.getTitle());
        newPost.setUserid(id);
        newPost.setBody(postDTO.getBody());
        return repository.save(newPost);
    }


    @Override
    public GloQuora_Post updatePost(String id, InputPostDTO postDTO){

        if(repository.findById(id).isPresent()){

            GloQuora_Post post = repository.findById(id).get();
            post.setBody(postDTO.getBody());
            post.setTitle(postDTO.getTitle());
            return repository.save(post);
        }
        throw new NullPointerException("Post ID Invalid");
    }

    @Override
    public String deletePost(String id) {
        try{
            repository.deleteById(id);
            return "Successfully Deleted!!";
        }
        catch (Exception e){
            return "PostId Invalid";
        }

    }

}
