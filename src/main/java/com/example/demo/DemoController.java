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

    @GetMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("data1", " 홍길동님.");
        model.addAttribute("data2", " 방갑습니다.");
        model.addAttribute("data3", " 오늘.");
        model.addAttribute("data4", " 날씨는.");
        model.addAttribute("data5", " 매우 좋습니다.");
        return "hello2";
    }
}
