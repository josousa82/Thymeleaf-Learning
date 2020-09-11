package com.thymeleaflearning.form_validation.controllers;

import com.thymeleaflearning.form_validation.dto.FormCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by sousaJ on 10/09/2020
 * in package - com.thymeleaflearning.form_validation.controllers
 **/
@Slf4j
@Controller
public class FormController {

    @GetMapping({"", "/", "/index.html", "/index" })
    public String indexPage(Model model){
        model.addAttribute("varString", "3 test string");
        return "index";
    }

    @GetMapping({"/fooForm", "/fooForm.html", "/fooForm" })
    public String fooForm(Model model){
        model.addAttribute("command", new FormCommand());
        return "fooForm";
    }

    @ModelAttribute("multiCheckboxAllValues")
    public String[] getMultiCheckboxAllValues(){
         return new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }



}
