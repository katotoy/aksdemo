package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.dto.GetInquiryByDateRequestDto;
import com.yahoo.cybertactics.aksdemo.dto.InquiryDto;
import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import com.yahoo.cybertactics.aksdemo.service.InquiryService;
import com.yahoo.cybertactics.aksdemo.service.ReCaptchaValidationService;
import com.yahoo.cybertactics.aksdemo.utils.CustomResponse;
import com.yahoo.cybertactics.aksdemo.utils.CustomValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/inquiry")
public class InquiryController extends BaseController{

    private final InquiryService inquiryService;
    private ReCaptchaValidationService validator;

    public InquiryController(InquiryService inquiryService, ReCaptchaValidationService validator) {
        this.inquiryService = inquiryService;
        this.validator = validator;
    }

    @GetMapping
    public List<InquiryDto> getInquiries(){

        List<Inquiry> inquiryList = inquiryService.getAllInquiries();

        return inquiryList.stream()
                .map(e -> new InquiryDto(e))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<CustomResponse> saveInquiry(@RequestBody @Valid InquiryRequestDto requestDto){

        validateRequestDto(requestDto);
        inquiryService.saveInquiry(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomResponse("new inquiry saved"));
    }

    private void validateRequestDto(InquiryRequestDto requestDto){

        if(requestDto.getRequest().equalsIgnoreCase("I have a feedback") && (requestDto.getRequestText() == null || requestDto.getRequestText().isBlank())){
            throw new CustomValidationException(this.getClass().getSimpleName(), "Feedback field is required", "requestText");
        }
    }

    @PostMapping(value = "/daterange")
    public ResponseEntity<CustomResponse> getInquiryByDate(@RequestBody @Valid GetInquiryByDateRequestDto requestDto){

        if(requestDto.getStartDate().compareTo(requestDto.getEndDate()) > 0){
            throw new CustomValidationException(this.getClass().getSimpleName(), "Start date should be equal to or greater than End date.", "date range");
        }

        List<InquiryDto> results = inquiryService.getInquiriesByDateRange(requestDto);
        return new ResponseEntity(results, HttpStatus.OK);
    }
}
