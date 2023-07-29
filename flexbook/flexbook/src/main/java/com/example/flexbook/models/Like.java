package com.example.flexbook.models;

import jakarta.persistence.*;
import lombok.*;
// import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
@Data
@NoArgsConstructor
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Like(User user, Post post, LocalDateTime createdAt) {
        this.user = user;
        this.post = post;
        this.createdAt = createdAt;
    }

    
}