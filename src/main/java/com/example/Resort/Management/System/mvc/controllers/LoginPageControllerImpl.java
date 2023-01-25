package com.example.Resort.Management.System.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginPageControllerImpl implements ILoginPageController{
    @GetMapping("/login")
    @Override
    public String showLoginPage() {
        return "login_page";
    }

    @Override
    public String captureLoginPage() {
        return null;
    }
}
