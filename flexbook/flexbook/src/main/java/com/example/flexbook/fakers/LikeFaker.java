package com.example.flexbook.fakers;

import com.example.flexbook.models.Like;
import com.example.flexbook.models.Post;
import com.example.flexbook.models.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LikeFaker {
    // @Autowired
    // private Faker faker;
    public Like generate(User user, Post post){
        return new Like(
                user,
                post,
                LocalDateTime.now()
        );
    }
}
