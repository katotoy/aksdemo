package com.yahoo.cybertactics.aksdemo.dto;

import java.io.Serializable;

public class InquiryRequestDto implements Serializable {

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String request;
    private String requestText;
    private boolean isCustomer;

    public InquiryRequestDto() {
    }

    public InquiryRequestDto(String firstName, String lastName, String contactNumber, String request, String requestText, boolean isCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.request = request;
        this.requestText = requestText;
        this.isCustomer = isCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRequestText() {
        return requestText;
    }

    public void setRequestText(String requestText) {
        this.requestText = requestText;
    }

    public boolean isCustomer() {
        return isCustomer;
    }

    public void setCustomer(boolean customer) {
        isCustomer = customer;
    }
}
