package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.service.InquiryService;
import com.yahoo.cybertactics.aksdemo.service.ReCaptchaValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/inquiry")
public class InquiryFormController {

    @Autowired
    private InquiryService inquiryService;

    @Autowired
    private ReCaptchaValidationService validator;

    public InquiryFormController(InquiryService inquiryService, ReCaptchaValidationService validator) {
        this.inquiryService = inquiryService;
        this.validator = validator;
    }

    @GetMapping("/form")
    public String loadInquiryForm(Model model){
        model.addAttribute("inquiry", new InquiryRequestDto());
        return "inquiry-form";
    }

    @PostMapping("/form")
    public String processInquiryForm(@ModelAttribute InquiryRequestDto data, @RequestParam(name="g-recaptcha-response")
            String captcha, Model model){

        if(!validator.validateCaptcha(captcha)){
            model.addAttribute("message", "Please Verify Captcha");
        }
        inquiryService.saveInquiry(data);
        return "inquiry-thank-you";
    }
}
