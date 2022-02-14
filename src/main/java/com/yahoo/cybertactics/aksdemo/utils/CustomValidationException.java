package com.yahoo.cybertactics.aksdemo.utils;

import org.springframework.core.MethodParameter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class CustomValidationException extends RuntimeException{

    private String objectName;
    private String fieldName;
    private String defaultMessage;

    public CustomValidationException(){}

    public CustomValidationException(String objectName, String fieldName, String defaultMessage) {
        super(defaultMessage);
        this.objectName = objectName;
        this.fieldName = fieldName;
        this.defaultMessage = defaultMessage;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}
