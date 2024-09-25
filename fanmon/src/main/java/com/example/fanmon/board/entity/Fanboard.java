package com.example.fanmon.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="fanboard")
public class Fanboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fanboarduuid", updatable = false, nullable = false)
    private UUID fanboarduuid;

//    @ManyToOne
//    @JoinColumn(name="useruuid")
//    private User useruuid;

    private String title;
    private LocalDateTime postdate;
    private String content;
    private long likecount;
}
