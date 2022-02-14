package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.service.InquiryService;
import com.yahoo.cybertactics.aksdemo.service.ReCaptchaValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public String processInquiryForm(@Valid @ModelAttribute("inquiry") InquiryRequestDto inquiry,
                                     BindingResult bindingResult, @RequestParam(name="g-recaptcha-response") String captcha, Model model){

        if(!validator.validateCaptcha(captcha)){
            model.addAttribute("message", "Please Verify Captcha");
        }

        if (bindingResult.hasErrors()) {
            return "inquiry-form";
        }

        inquiryService.saveInquiry(inquiry);
        return "inquiry-thank-you";
    }
}
