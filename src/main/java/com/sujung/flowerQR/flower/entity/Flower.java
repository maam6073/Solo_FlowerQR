package com.sujung.flowerQR.flower.entity;


import javax.persistence.*;

@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long flowerId;

    @Column
    private String name;

    @Column
    private String sub_name;

    @Column
    private String content;

    @Column
    private String sunlight_content;
}
