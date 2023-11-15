package com.sujung.flowerQR.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(nullable = false)
    private String title;

    @Column
    private String content;

    @Column
    @Getter
    private int content_pw;

    @Column
    private String comment;

    @Column
    private int view_count;

    @Column
    private String picture_url;
}
