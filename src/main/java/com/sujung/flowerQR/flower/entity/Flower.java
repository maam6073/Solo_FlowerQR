package com.sujung.flowerQR.flower.entity;


import com.sujung.flowerQR.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Flower extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flower_id")
    private Long flower_id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "sub_name")
    private String sub_name;

    @Column(name = "content")
    private String content;

    @Column(name = "sunlight_content")
    private String sunlight_content;
}
