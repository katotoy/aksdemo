package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.dto.InquiryDto;
import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import com.yahoo.cybertactics.aksdemo.service.InquiryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/inquiry")
public class InquiryController {

    private final InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping
    public List<InquiryDto> getInquiries(){

        List<Inquiry> inquiryList = inquiryService.getAllInquiries();
        List<InquiryDto> inquiryDtoList = new ArrayList<InquiryDto>();

        inquiryDtoList = inquiryList.stream()
                .map(e -> new InquiryDto(e))
                .collect(Collectors.toList());

        return inquiryDtoList;
    }
}
