package com.sujung.flowerQR.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class BoardDeleteDto {
    @Setter
    private Long boardId;
    @NotNull
    private int content_pw;
}
