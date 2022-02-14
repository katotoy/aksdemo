package com.yahoo.cybertactics.aksdemo.utils;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class CustomError {
    private int errorCode;
    private String error;
    private List<String> fieldErrors = new ArrayList<>();

    public CustomError(HttpStatus status,  List<String> fieldErrors ) {
        this.errorCode = status.value();
        this.error = status.name();
        this.fieldErrors = fieldErrors;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<String> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }
}
