package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.dto.InquiryRequestDto;
import com.yahoo.cybertactics.aksdemo.service.InquiryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/inquiry")
public class InquiryFormController {

    private InquiryService inquiryService;

    public InquiryFormController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping("/form")
    public String loadInquiryForm(Model model){
        model.addAttribute("inquiry", new InquiryRequestDto());
        return "inquiry-form";
    }

    @PostMapping("/form")
    public String processInquiryForm(@ModelAttribute InquiryRequestDto data){
        System.out.println("test: " + data.getInquiry());
        inquiryService.saveInquriy(data);
        return "inquiry-thank-you";
    }
}
