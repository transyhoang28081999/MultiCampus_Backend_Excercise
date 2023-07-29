package com.example.flexbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flexbook.models.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
