package com.yahoo.cybertactics.aksdemo.utils;

public class CustomResponse {
    private String message;

    public CustomResponse(){}

    public CustomResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
