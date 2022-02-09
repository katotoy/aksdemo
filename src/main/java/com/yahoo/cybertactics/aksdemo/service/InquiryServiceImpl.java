package com.yahoo.cybertactics.aksdemo.service;

import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import com.yahoo.cybertactics.aksdemo.repos.InquiryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InquiryServiceImpl implements  InquiryService{

    private InquiryRepository inquiryRepository;

    public InquiryServiceImpl(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @Override
    public String saveInquiry(InquiryRequestDto requestDto) {

        Inquiry newInquiry = new Inquiry();
        newInquiry.setFirst_name(requestDto.getFirst_name());
        newInquiry.setLast_name(requestDto.getLast_name());
        newInquiry.setContact_number(requestDto.getContact_number());
        newInquiry.setRequest(requestDto.getRequest());
        newInquiry.setMessage_text(requestDto.getMessage_text());
        newInquiry.setCustomer(requestDto.isCustomer());
        newInquiry.setDate_created(LocalDate.now());

        inquiryRepository.save(newInquiry);

        return "OK";
    }

    @Override
    public List<Inquiry> getAllInquiries() {
        return inquiryRepository.findAll();
    }
}
