package com.example.flexbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flexbook.models.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{
    
}
