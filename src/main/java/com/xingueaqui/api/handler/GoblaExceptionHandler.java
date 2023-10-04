package com.xingueaqui.api.handler;

import com.xingueaqui.api.handler.dto.CustomErrorResponse;
import com.xingueaqui.api.handler.dto.ValidationError;
import com.xingueaqui.api.handler.dto.ValidationFieldError;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GoblaExceptionHandler {
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ValidationError> constraintViolationExceptionHandler(MethodArgumentNotValidException e) {
        List<ValidationFieldError> fieldErrors = new ArrayList<>();
        HttpStatus badRequestStatus = HttpStatus.BAD_REQUEST;

        e.getFieldErrors().forEach(v -> {
            fieldErrors.add(new ValidationFieldError(v.getField(), v.getDefaultMessage()));
        });

        ValidationError error = new ValidationError(badRequestStatus.value(), true, fieldErrors);
        return ResponseEntity.status(badRequestStatus).body(error);
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseEntity<CustomErrorResponse> httpMessageNotReadableExceptionHandler(HttpMessageNotReadableException e) {
        String enumMessageError = "JSON parse error: Cannot deserialize value of type `com.xingueaqui.api.enums.SwearWordCategorieEnum` from String";
        String messageError;
        HttpStatus badRequestStatus = HttpStatus.BAD_REQUEST;

        if(e.getMessage().contains(enumMessageError)) {
            messageError = "Categoria inválida.";
        } else {
            messageError = "Erro ao serializar o JSON da requisição.";
        }

        CustomErrorResponse error = new CustomErrorResponse(badRequestStatus.value(), true, messageError);
        return ResponseEntity.status(badRequestStatus).body(error);
    }
}
