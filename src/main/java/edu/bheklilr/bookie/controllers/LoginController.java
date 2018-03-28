package edu.bheklilr.bookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private static final String VIEW = "login";

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("activeTab", "home");
        return VIEW;
    }
}
