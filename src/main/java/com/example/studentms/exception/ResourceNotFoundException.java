package com.example.studentms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// This annotation causes Spring Boot to respond with the specified
// HTTP status code whenever this exception is thrown from your controller.
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L; // Good practice for Serializable classes

    public ResourceNotFoundException(String message) {
        super(message);
    }
}