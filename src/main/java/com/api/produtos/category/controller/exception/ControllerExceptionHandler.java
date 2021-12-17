package com.api.produtos.category.controller.exception;

import com.api.produtos.category.service.exception.CategoryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

        @ExceptionHandler(CategoryNotFoundException.class)
        public ResponseEntity<StandardError> categoryNotFound(CategoryNotFoundException e, HttpServletRequest request){
            StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
        }
}
