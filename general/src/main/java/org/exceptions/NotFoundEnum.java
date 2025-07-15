package org.exceptions;

public class NotFoundEnum extends RuntimeException {
    public NotFoundEnum(String message) {
        super(message);
    }
}
