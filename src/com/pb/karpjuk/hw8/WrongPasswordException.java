package com.pb.karpjuk.hw8;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Некоректний password";
    }

    public WrongPasswordException(String detail) {
        super(detail);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
