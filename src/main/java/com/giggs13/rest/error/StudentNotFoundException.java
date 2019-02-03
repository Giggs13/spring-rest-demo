package com.giggs13.rest.error;

public class StudentNotFoundException
        extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(int id) {
        super("Student id not found - " + id);
    }

    public StudentNotFoundException(String message,
                                    Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
