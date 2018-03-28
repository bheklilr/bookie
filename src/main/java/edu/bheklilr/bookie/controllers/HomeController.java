package edu.bheklilr.bookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public static final String VIEW = "index";

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("activeTab", "home");
        return VIEW;
    }

    @RequestMapping("/books")
    public String books(Model model) {
        model.addAttribute("activeTab", "books");
        return VIEW;
    }

    @RequestMapping("/account")
    public String account(Model model) {
        model.addAttribute("activeTab", "account");
        return VIEW;
    }
}
