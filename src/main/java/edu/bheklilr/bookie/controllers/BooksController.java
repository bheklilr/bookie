package edu.bheklilr.bookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {
    private static final String VIEW = "books";

    @RequestMapping(path="books")
    public String books(Model model) {
        model.addAttribute("activeTab", "books");
        return VIEW;
    }
}
