package edu.bheklilr.bookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {
    private static final String VIEW = "login";

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("activeTab", "login");
        return VIEW;
    }

    @RequestMapping(value = "/do-login", method = RequestMethod.POST)
    public RedirectView doLogin() {
        return new RedirectView("/");
    }
}
