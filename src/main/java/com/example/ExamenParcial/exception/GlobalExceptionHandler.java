package com.example.ExamenParcial.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        // Log del error
        System.err.println("Error: " + ex.getMessage());
        // Devuelve un mensaje genérico de error
        return new ResponseEntity<>("Ocurrió un error en el servidor kaumzaaaaaa", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
