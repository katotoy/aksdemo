package com.yahoo.cybertactics.aksdemo.service;

import com.yahoo.cybertactics.aksdemo.dto.GetInquiryByDateRequestDto;
import com.yahoo.cybertactics.aksdemo.dto.InquiryDto;
import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.model.Inquiry;

import java.util.List;

public interface InquiryService {

    String saveInquiry(InquiryRequestDto requestDto);

    List<Inquiry> getAllInquiries();

    List<InquiryDto> getInquiriesByDateRange(GetInquiryByDateRequestDto requestDto);
}
