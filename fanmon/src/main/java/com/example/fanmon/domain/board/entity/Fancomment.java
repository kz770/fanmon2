package com.example.fanmon.domain.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="fancomment")
public class Fancomment {
    @Id
    @Column(name = "fancommentuuid", nullable = false)
    private UUID fancommentuuid;

    @PrePersist
    public void generateUUID(){
        if(fancommentuuid == null){
            fancommentuuid = UUID.randomUUID();
        }
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fanboarduuid")
    private Fanboard fanboard;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="useruuid")
//    private User user;

    private LocalDateTime createdat;
    private String content;
    private long ref;
    private long level;
    private long step;
}
