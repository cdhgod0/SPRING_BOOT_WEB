package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.domain.Article;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;

@Controller
public class BlogController {
    @Autowired // 객체 주입 자동화
    BlogService blogService;

    public BlogController(BlogService blogService) {
        // this.paymentService = new PaymentService(); // DI 없으면 객체를 직접 생성
        this.blogService = blogService; // 생성자를 통해 초기화
    }

    @GetMapping("/article_list") // 게시판 링크 지정
    public String article_list(Model model) {
        List<Article> list = blogService.findAll(); // 게시판 전체 리스트
        model.addAttribute("articles", list); // 모델에 추가
        return "article_list"; // .HTML 연결
    }

    @PostMapping("/api/articles")
    public String addArticle(@ModelAttribute AddArticleRequest request) {
        blogService.save(request);
        return "redirect:/article_list";
    }
}