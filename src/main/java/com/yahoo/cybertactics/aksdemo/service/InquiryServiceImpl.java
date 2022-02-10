package com.yahoo.cybertactics.aksdemo.service;

import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import com.yahoo.cybertactics.aksdemo.repos.InquiryRepository;
import org.springframework.data.domain.Sort;
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
        newInquiry.setFirstName(requestDto.getFirstName());
        newInquiry.setLastName(requestDto.getLastName());
        newInquiry.setContactNumber(requestDto.getContactNumber());
        newInquiry.setRequest(requestDto.getRequest());
        newInquiry.setRequestText(requestDto.getRequestText());
        newInquiry.setCustomer(requestDto.isCustomer());
        newInquiry.setDateCreated(LocalDate.now());

        inquiryRepository.save(newInquiry);

        return "OK";
    }

    @Override
    public List<Inquiry> getAllInquiries() {
        return inquiryRepository.findAll(Sort.by("dateCreated").descending().and(Sort.by("id").descending()));
    }
}
