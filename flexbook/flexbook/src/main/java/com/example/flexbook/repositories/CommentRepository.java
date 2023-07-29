package com.example.flexbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flexbook.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    
}
