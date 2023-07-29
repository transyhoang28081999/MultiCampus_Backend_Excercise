package com.example.flexbook.fakers;

import com.example.flexbook.models.*;
import com.example.flexbook.repositories.*;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SeedDatabase implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private LikeRepository likeRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private FriendRepository friendRepository;

    @Autowired
    private UserFaker userFaker;

    @Autowired
    private PostFaker postFaker;

    @Autowired
    private LikeFaker likeFaker;

    @Autowired
    private CommentFaker commentFaker;

    @Autowired
    private MessageFaker messageFaker;

    @Autowired
    private FriendFaker friendFaker;

    @Autowired
    private Faker faker;

    @Override
    public void run(String... args) throws Exception {
        // Generate 10 fake users
        List<User> users = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            User user = userFaker.generate();
            users.add(user);
        }
        userRepository.saveAll(users);

        // Generate 100 fake posts
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = users.get(faker.number().numberBetween(0, users.size()));
            Post post = postFaker.generate(user);
            posts.add(post);
        }
        postRepository.saveAll(posts);
        // Generate 200 fake likes
        List<Like> likes = new ArrayList<>();
        for(int i = 0; i < 200; i++){
            User user = users.get(faker.number().numberBetween(0, users.size()));
            Post post = posts.get(faker.number().numberBetween(0, posts.size()));
            Like like = likeFaker.generate(user, post);
            likes.add(like);
        }
        likeRepository.saveAll(likes);
        //generate 200 fake comments
        List<Comment> comments = new ArrayList<>();
        for(int i = 0; i < 200; i++){
            User user = users.get(faker.number().numberBetween(0, users.size()));
            Post post = posts.get(faker.number().numberBetween(0, posts.size()));
            Comment comment = commentFaker.generate(user, post);
            comments.add(comment);
        }
        commentRepository.saveAll(comments);
        //Generate 200 fake messages
        List<Message> messages = new ArrayList<>();
        for(int i = 0; i < 200; i++){
            User sender = users.get(faker.number().numberBetween(0, users.size()));
            User receiver = users.get(faker.number().numberBetween(0, users.size()));
            Message message = messageFaker.generate(sender, receiver);
            messages.add(message);
        }
        messageRepository.saveAll(messages);
        //Generate 200 fake friends
        List<Friend> friends = new ArrayList<>();
        for(int i = 0; i < 200; i++){
            User user1 = users.get(faker.number().numberBetween(0, users.size()));
            User user2 = users.get(faker.number().numberBetween(0, users.size()));
            Friend friend = friendFaker.generate(user1, user2);
            friends.add(friend);
        }
        friendRepository.saveAll(friends);
    }
}