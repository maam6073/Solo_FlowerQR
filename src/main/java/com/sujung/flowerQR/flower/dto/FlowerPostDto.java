package com.sujung.flowerQR.flower.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class FlowerPostDto {

    @NotBlank
    private String name;


    @NotBlank
    private String sub_name;


    @NotBlank
    private String content;


    @NotBlank
    private String sunlight_content;
}
