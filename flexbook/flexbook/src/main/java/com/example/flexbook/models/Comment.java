package com.example.flexbook.models;

import jakarta.persistence.*;
import lombok.*;
// import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Comment(User user, Post post, String comment, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.user = user;
        this.post = post;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}