package com.gleasondev.form.web;

import com.gleasondev.form.web.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class FormController {
    User user = new User();


    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result) {
        if (user.getFirstName().equals(user.getLastName())) result.rejectValue("lastName", "", "Please Enter valid Data");
        if (result.hasErrors()) return "sign-up";
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String getResult() {

        return "result";
    }
}
