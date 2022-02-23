package com.yahoo.cybertactics.aksdemo.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class GetInquiryByDateRequestDto {

    @NotNull(message = "start date cannot be empty")
    private LocalDate startDate;

    @NotNull(message = "end date cannot be empty")
    private LocalDate endDate;

    public GetInquiryByDateRequestDto(){}

    public GetInquiryByDateRequestDto(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
