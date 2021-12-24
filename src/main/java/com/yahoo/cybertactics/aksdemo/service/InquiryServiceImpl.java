package com.yahoo.cybertactics.aksdemo.service;

import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import com.yahoo.cybertactics.aksdemo.repos.InquiryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryServiceImpl implements  InquiryService{

    private InquiryRepository inquiryRepository;

    public InquiryServiceImpl(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @Override
    public String saveInquriy(InquiryRequestDto requestDto) {

        Inquiry newInquiry = new Inquiry();
        newInquiry.setName(requestDto.getName());
        newInquiry.setMobileNumber(requestDto.getMobileNumber());
        newInquiry.setTopic(requestDto.getTopic());
        newInquiry.setInquiry(requestDto.getInquiry());

        inquiryRepository.save(newInquiry);

        return "OK";
    }

    @Override
    public List<Inquiry> getAllInquiries() {
        return inquiryRepository.findAll();
    }
}
