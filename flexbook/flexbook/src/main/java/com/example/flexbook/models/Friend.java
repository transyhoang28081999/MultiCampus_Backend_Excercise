package com.example.flexbook.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "friends")
@Data
@NoArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id1")
    private User user1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id2")
    private User user2;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private FriendStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_user_id")
    private User actionUser;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Friend(User user1, User user2, FriendStatus status, User actionUser, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.user1 = user1;
        this.user2 = user2;
        this.status = status;
        this.actionUser = actionUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
}