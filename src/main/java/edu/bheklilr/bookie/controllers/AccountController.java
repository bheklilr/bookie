package edu.bheklilr.bookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    private static final String VIEW = "account";

    @RequestMapping("/account")
    public String account(Model model) {
        model.addAttribute("activeTab", "account");
        return VIEW;
    }
}
