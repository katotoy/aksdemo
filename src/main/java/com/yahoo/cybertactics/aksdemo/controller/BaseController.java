package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.utils.CustomError;
import com.yahoo.cybertactics.aksdemo.utils.CustomValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class BaseController {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomError handleMethodViolationException(MethodArgumentNotValidException ex) {

        BindingResult result = ex.getBindingResult();

        List<String> errorList = new ArrayList<>();
        result.getFieldErrors().forEach((fieldError) -> {
            errorList.add(fieldError.getObjectName()+"."+fieldError.getField()+" : " +fieldError.getDefaultMessage() +" : rejected value [" +fieldError.getRejectedValue() +"]" );
        });
        result.getGlobalErrors().forEach((fieldError) -> {
            errorList.add(fieldError.getObjectName()+" : " +fieldError.getDefaultMessage() );
        });

        return new CustomError(HttpStatus.BAD_REQUEST, errorList);

    }

    @ExceptionHandler({CustomValidationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomError handleCustomValidationException(CustomValidationException ex) {

        List<String> errorList = new ArrayList<>();
        errorList.add(ex.getObjectName() + ". " +  ex.getFieldName() + " : " + ex.getDefaultMessage() +" : rejected value []" );

        return new CustomError(HttpStatus.BAD_REQUEST, errorList);

    }
}
