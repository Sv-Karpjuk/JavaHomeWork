package com.pb.karpjuk.hw8;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "Некоректний login";
    }

    public WrongLoginException(String detail) {
        super(detail);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
