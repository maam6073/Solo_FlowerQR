package com.sujung.flowerQR.flower.dto;

import lombok.*;

@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FlowerResponseDto {

    private String name;


    private String sub_name;


    private String content;


    private String sunlight_content;
}
