package com.thymeleaflearning.form_validation.controllers;

import com.thymeleaflearning.form_validation.dto.FormCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by sousaJ on 10/09/2020
 * in package - com.thymeleaflearning.form_validation.controllers
 **/
@Slf4j
@Controller
public class FormController {

//    @GetMapping({"", "/", "/index.html", "/index" })
//    public String indexPage(Model model){
//        model.addAttribute("varString", "3 test string");
//        return "index";
//    }

    @GetMapping({"", "/", "/fooForm.html"})
    public String fooForm(Model model){
        model.addAttribute("command", new FormCommand());
        return "fooForm";
    }

    @ModelAttribute("multiCheckboxAllValues")
    public String[] getMultiCheckboxAllValues(){
         return new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    @ModelAttribute("singleSelectAllValues")
    public String[] getSingleSelectAllValues(){
        return new String[]{"YES", "NO", "MAYBE"};
    }

    @PostMapping("/fooForm")
    public String foobarPost(
            @ModelAttribute("command") FormCommand command,
            // WARN: BindingResult *must* immediately follow the Command.
            // https://stackoverflow.com/a/29883178/1626026
            BindingResult bindingResult,
            Model model,
            RedirectAttributes ra ) {

        log.debug("form submission.");

        if ( bindingResult.hasErrors() ) {
            return "fooForm";
        }

        ra.addFlashAttribute("command", command);

        return "redirect:/fooresult";
    }

    @GetMapping("/fooresult")
    public String fooresult(
            @ModelAttribute("command") FormCommand command,
            Model model) {

        log.debug( "!!!" + command.toString());

        return "fooResult";
    }



}
