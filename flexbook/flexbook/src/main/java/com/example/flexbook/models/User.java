package com.example.flexbook.models;

import jakarta.persistence.*;

// import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "bio")
    private String bio;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public User(String username, String email, String password, String profilePicture, String bio, LocalDateTime createdAt,
    LocalDateTime updatedAt) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    
}
