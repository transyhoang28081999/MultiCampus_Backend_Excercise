package com.example.flexbook.fakers;

import com.example.flexbook.models.Message;
import com.example.flexbook.models.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MessageFaker {
    @Autowired
    private Faker faker;

    public Message generate(User sender, User receiver){
        return new Message(
                sender,
                receiver,
                faker.lorem().sentence(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
