package com.yahoo.cybertactics.aksdemo.dto;

import com.yahoo.cybertactics.aksdemo.model.Inquiry;

import java.io.Serializable;

public class InquiryDto implements Serializable {

    private final Long id;
    private final String name;
    private final String mobileNumber;
    private final String topic;
    private final String inquiry;

    public InquiryDto(Inquiry e) {
        this.id = e.getId();
        this.name = e.getName();
        this.mobileNumber = e.getMobileNumber();
        this.topic = e.getTopic();
        this.inquiry = e.getInquiry();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getTopic() {
        return topic;
    }

    public String getInquiry() {
        return inquiry;
    }
}
