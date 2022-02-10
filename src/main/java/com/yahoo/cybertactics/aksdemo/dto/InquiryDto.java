package com.yahoo.cybertactics.aksdemo.dto;

import com.yahoo.cybertactics.aksdemo.model.Inquiry;

import java.io.Serializable;
import java.time.LocalDate;

public class InquiryDto implements Serializable {

    private Long id;
    private LocalDate dateCreated;

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String request;
    private String requestText;
    private boolean isCustomer;

    public InquiryDto(){}

    public InquiryDto(Inquiry e) {
        this.id = e.getId();
        this.dateCreated = e.getDateCreated();
        this.firstName = e.getFirstName();
        this.lastName = e.getLastName();
        this.contactNumber = e.getContactNumber();
        this.request = e.getRequest();
        this.requestText = e.getRequestText();
        this.isCustomer = e.isCustomer();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getRequest() {
        return request;
    }

    public String getRequestText() {
        return requestText;
    }

    public boolean isCustomer() {
        return isCustomer;
    }
}
