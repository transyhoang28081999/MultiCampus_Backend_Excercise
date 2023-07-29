package com.example.flexbook.fakers;

import com.example.flexbook.models.Comment;
import com.example.flexbook.models.Post;
import com.example.flexbook.models.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CommentFaker {
    @Autowired
    private Faker faker;

    public Comment generate(User user, Post post){
        return new Comment(
                user,
                post,
                faker.lorem().sentence(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
