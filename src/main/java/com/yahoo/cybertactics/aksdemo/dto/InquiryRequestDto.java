package com.yahoo.cybertactics.aksdemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class InquiryRequestDto implements Serializable {

    @NotBlank(message = "First Name field is required.")
    private String firstName;

    @NotBlank(message = "Last Name field is required.")
    private String lastName;

    @NotBlank(message = "Contact Number field is required.")
    @Pattern(regexp = "^[+](?:.*\\d){10}?$", message = "Invalid Pattern. Must be +<10-digit number>")
    private String contactNumber;

    @NotBlank(message = "Contact topic field is required.")
    private String request;

    private String requestText;
    private boolean isCustomer;

    public InquiryRequestDto(){}
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
