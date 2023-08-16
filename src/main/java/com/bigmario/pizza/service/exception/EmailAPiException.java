package com.bigmario.pizza.service.exception;

public class EmailAPiException extends RuntimeException{
    public EmailAPiException() {
        super("Error sending mail...");
    }
}
