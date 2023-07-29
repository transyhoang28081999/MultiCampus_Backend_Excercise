package com.example.flexbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flexbook.models.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long>{
    
}
