package com.myblog11.impl;

import com.myblog11.Service.PostService;
import com.myblog11.entity.post;
import com.myblog11.payload.PostDto;
import com.myblog11.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto CreatePost(PostDto postDto) {
        post post =new post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post savedPost = postRepository.save(post);


        PostDto dto= new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto;
    }
}
