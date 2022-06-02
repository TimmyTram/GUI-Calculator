package edu.csc413.calculator.exceptions;

public class InvalidTokenException extends Exception {
    public InvalidTokenException() {
        super("*** Invalid Token *** : ");
    }

    public InvalidTokenException(String message) {
        super("*** Invalid Token *** : " + message);
    }
}
