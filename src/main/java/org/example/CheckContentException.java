package org.example;

public class CheckContentException extends RuntimeException{
    public CheckContentException(String message) {
        super(message);
    }

    public CheckContentException() {
        super();
    }
}
