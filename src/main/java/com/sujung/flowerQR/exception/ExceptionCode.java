package com.sujung.flowerQR.exception;

import lombok.Getter;

public enum ExceptionCode {
    BOARD_NOT_FOUND(404,"Board Not Found"),
    NO_PERMISSION(400, "No permission");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int status, String message){
        this.status = status;
        this.message = message;
    }
}
