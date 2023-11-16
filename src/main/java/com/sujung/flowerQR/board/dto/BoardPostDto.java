package com.sujung.flowerQR.board.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@NoArgsConstructor
public class BoardPostDto {

    @NotBlank
    private String nickname;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotNull
    private int content_pw;

}
