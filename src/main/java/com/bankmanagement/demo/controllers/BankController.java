package com.bankmanagement.demo.controllers;

import com.bankmanagement.demo.dto.BankDTO;
import com.bankmanagement.demo.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
    @Autowired
    private BankService bankService;
    @GetMapping(value = "/add")
    public ModelAndView addBank(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("add", new BankDTO());
        mav.setViewName("add");
        return mav;
    }

    @PostMapping(value = "/add-process")
    public ModelAndView addProcess(BankDTO bankDTO) {
        System.out.println(bankDTO); // Print user
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/index"); // Redirect to home
        return mav;
    }

}
