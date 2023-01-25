package com.example.Resort.Management.System.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationPageControllerImpl implements IRegistrationPageController{
    @GetMapping("/registration")
    @Override
    public String showRegistrationPage() {
        return "registration_page";
    }

    @Override
    public String captureRegistrationPage() {
        return null;
    }
}
