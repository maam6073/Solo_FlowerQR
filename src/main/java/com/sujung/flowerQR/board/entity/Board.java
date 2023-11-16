package com.sujung.flowerQR.board.entity;

import com.sujung.flowerQR.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column
    private String nickname;

    @Column
    private String title;

    @Column
    @Setter
    private String content;

    @Column
    private int content_pw;

    @Column
    private String comment;

    @Column
    private int view_count;

    @Column
    private String picture_url;
}
