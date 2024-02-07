package com.myblog11.repository;

import com.myblog11.Service.PostService;
import com.myblog11.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<post, Long> {
}
