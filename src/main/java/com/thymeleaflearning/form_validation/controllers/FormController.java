package com.thymeleaflearning.form_validation.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
