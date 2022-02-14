package com.yahoo.cybertactics.aksdemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "inquiry")
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateCreated;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String contactNumber;

    @NotNull
    private String request;
    private String requestText;

    @NotNull
    private boolean isCustomer;

    public Inquiry(){}

    public Inquiry(LocalDate dateCreated, String firstName, String lastName, String contactNumber, String request, String requestText, boolean isCustomer) {
        this.dateCreated = dateCreated;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.request = request;
        this.requestText = requestText;
        this.isCustomer = isCustomer;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
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