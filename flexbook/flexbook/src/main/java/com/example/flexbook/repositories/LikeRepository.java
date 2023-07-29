package com.example.flexbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flexbook.models.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{
    
}
