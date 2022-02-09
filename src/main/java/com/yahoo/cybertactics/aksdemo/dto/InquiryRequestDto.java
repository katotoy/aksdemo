package com.yahoo.cybertactics.aksdemo.dto;

import java.io.Serializable;

public class InquiryRequestDto implements Serializable {

    private String first_name;
    private String last_name;
    private String contact_number;
    private String request;
    private String message_text;
    private boolean isCustomer;

    public InquiryRequestDto() {
    }

    public InquiryRequestDto(String first_name, String last_name, String contact_number, String request, String message_text, boolean isCustomer) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.contact_number = contact_number;
        this.request = request;
        this.message_text = message_text;
        this.isCustomer = isCustomer;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public boolean isCustomer() {
        return isCustomer;
    }

    public void setCustomer(boolean customer) {
        isCustomer = customer;
    }
}
