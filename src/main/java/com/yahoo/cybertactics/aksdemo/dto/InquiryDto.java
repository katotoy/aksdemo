package com.yahoo.cybertactics.aksdemo.dto;

import com.yahoo.cybertactics.aksdemo.model.Inquiry;

import java.io.Serializable;
import java.time.LocalDate;

public class InquiryDto implements Serializable {

    private Long id;
    private LocalDate date_created;

    private String first_name;
    private String last_name;
    private String contact_number;
    private String request;
    private String message_text;
    private boolean isCustomer;

    public InquiryDto(){}

    public InquiryDto(Inquiry e) {
        this.id = e.getId();
        this.date_created = e.getDate_created();
        this.first_name = e.getFirst_name();
        this.last_name = e.getLast_name();
        this.contact_number = e.getContact_number();
        this.request = e.getRequest();
        this.message_text = e.getMessage_text();
        this.isCustomer = e.isCustomer();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDate date_created) {
        this.date_created = date_created;
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
