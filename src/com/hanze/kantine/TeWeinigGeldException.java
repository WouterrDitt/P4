package com.hanze.kantine;

public class TeWeinigGeldException extends Exception {
    public TeWeinigGeldException() {
        super();
    }

    public TeWeinigGeldException(Exception e) {
        super(e);
    }

    public TeWeinigGeldException(String message) {
        super(message);
    }
}
