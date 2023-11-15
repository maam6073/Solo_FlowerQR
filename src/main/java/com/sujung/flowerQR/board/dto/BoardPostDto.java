package com.sujung.flowerQR.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardPostDto {

    @NotBlank
    private String nickname;

    @NotBlank
    private String title;

    @NotBlank
    private String content;


    @NotBlank
    private int content_pw;

}
