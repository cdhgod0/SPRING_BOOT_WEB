package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", " 방갑습니다.");
        return "hello";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("data", " 방갑습니다.");
        return "index";
    }
}
