package com.exceptionHandling;

import java.io.IOException;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
