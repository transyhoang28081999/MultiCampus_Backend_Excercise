package com.example.flexbook.models;

import jakarta.persistence.*;
import lombok.*;
// import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Data
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id")
    private User receiver;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Message(User sender, User receiver, String message, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    
}