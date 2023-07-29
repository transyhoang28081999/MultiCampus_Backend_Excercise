package com.example.flexbook.models;

import jakarta.persistence.*;
import lombok.*;
// import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "content")
    private String content;

    @Column(name = "post_image")
    private String postImage;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Post(User user, String content, String postImage, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.user = user;
        this.content = content;
        this.postImage = postImage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    
}
