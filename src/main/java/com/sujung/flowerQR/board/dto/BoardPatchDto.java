package com.sujung.flowerQR.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardPatchDto {

    private Long boardId;

    @NotNull
    private int content_pw;

    @NotBlank
    private String content;
}
