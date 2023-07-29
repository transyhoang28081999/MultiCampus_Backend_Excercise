package com.example.flexbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flexbook.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
