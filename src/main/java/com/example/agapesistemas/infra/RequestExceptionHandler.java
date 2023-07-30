package com.example.agapesistemas.infra;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RequestExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threat404(){
        var response = new ExceptionDTO("Dado não Encontrado");
        return ResponseEntity.badRequest().body(response);
    }
}
