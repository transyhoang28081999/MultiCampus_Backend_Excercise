package com.example.flexbook.fakers;

import com.example.flexbook.models.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class UserFaker {

    @Autowired
    private Faker faker;

    public User generate() {
        return new User(
                faker.name().username(),
                faker.internet().emailAddress(),
                faker.internet().password(),
                faker.internet().image(),
                faker.lorem().sentence(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
