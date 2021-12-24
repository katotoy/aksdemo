package com.yahoo.cybertactics.aksdemo.dto;

import java.io.Serializable;

public class InquiryRequestDto implements Serializable {
    private String name;
    private String mobileNumber;
    private String topic;
    private String inquiry;

    public InquiryRequestDto() {
    }

    public InquiryRequestDto(String name, String mobileNumber, String topic, String inquiry) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.topic = topic;
        this.inquiry = inquiry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInquiry() {
        return inquiry;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }
}
