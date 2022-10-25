package com.projeto.vendasAPI.exceptions;


import org.springframework.http.HttpStatus;

public class NotFoundException extends WebException {
    public NotFoundException(final String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
