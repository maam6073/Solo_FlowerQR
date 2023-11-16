package com.sujung.flowerQR.exception;

import lombok.Getter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

@Getter
public class ErrorResponse {
//    private List<FieldError> fieldErrors;   //유효성 검증에 대한 에러
//    private List<ConstraintViolationError> violationErrors;
//
//    private ErrorResponse(List<FieldError> fieldErrors, List<ConstraintViolationError> violationErrors){
//        this.fieldErrors = fieldErrors;
//        this.violationErrors = violationErrors;
//    }
//
//    public static ErrorResponse of(BindingResult bindingResult){
//        return new ErrorResponse(FieldError.of(bindingResult),null);
//    }
}
