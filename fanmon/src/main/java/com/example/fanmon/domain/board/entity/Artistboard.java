package com.example.fanmon.domain.board.entity;

import com.example.fanmon.domain.management.entity.Group;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="artistboard")
public class Artistboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artistboarduuid", updatable = false, nullable = false)
    private UUID artistboarduuid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="groupuuid")
    private Group group;

//    @ManyToOne
//    @JoinColumn(name="artistuuid", nullable = false)
//    private Artist artist;




    private LocalDateTime createdat;
    private String content;
    private long likecount;
}
