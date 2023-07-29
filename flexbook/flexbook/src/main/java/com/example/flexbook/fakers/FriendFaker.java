package com.example.flexbook.fakers;

import com.example.flexbook.models.Friend;
import com.example.flexbook.models.FriendStatus;
import com.example.flexbook.models.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class FriendFaker {

    private List<FriendStatus> friendStatuses;

    public FriendFaker() {
        this.friendStatuses = Arrays.asList(FriendStatus.values());
    }

    public Friend generate(User user1, User user2){
        Random random = new Random();
        int index = random.nextInt(friendStatuses.size());
        return new Friend(
                user1,
                user2,
                friendStatuses.get(index),
                user1,
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
