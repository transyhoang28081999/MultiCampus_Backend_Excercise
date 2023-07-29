package com.example.flexbook.fakers;

import com.example.flexbook.models.Post;
import com.example.flexbook.models.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PostFaker {

    @Autowired
    private Faker faker;

    public Post generate(User user) {
        return new Post(
                user,
                faker.lorem().sentence(),
                faker.internet().image(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}