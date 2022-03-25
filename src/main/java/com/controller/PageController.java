package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/mainchat")
    public String gotoMain(Model model){
        return "/WEB-INF/mainChat/main.html";
    }
}
