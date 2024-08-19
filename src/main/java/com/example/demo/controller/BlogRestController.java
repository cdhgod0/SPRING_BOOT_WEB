package com.example.demo.controller;

import com.example.demo.model.domain.Article;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BlogRestController {
    private final BlogService blogService;

    // POST /api/articles: 새로운 게시글 추가
    // GET /api/articles/{id}: 특정 게시글 조회
    // GET /api/articles: 모든 게시글 조회
    // PUT /api/articles/{id}: 특정 게시글 수정
    // DELETE /api/articles/{id}: 특정 게시글 삭제

    // @PostMapping("/api/articles")
    // public ResponseEntity<Article> addArticle(@ModelAttribute AddArticleRequest request) {
    //     Article saveArticle = blogService.save(request);
    //     return ResponseEntity.status(HttpStatus.CREATED)
    //         .body(saveArticle);
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Article> getArticle(@PathVariable Long id) {
    //     return blogService.findById(id)
    //         .map(article -> ResponseEntity.ok().body(article))
    //         .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    // }

    // @GetMapping("/api/articles_list")
    // public ResponseEntity<List<Article>> getAllArticles() {
    //      List<Article> articles = blogService.findAll();
    //      return ResponseEntity.ok().body(articles);
    //  }

    // @PutMapping("/{id}")
    // public ResponseEntity<Article> updateArticle(@PathVariable Long id, @RequestBody AddArticleRequest request) {
    //     Article updatedArticle = blogService.update(id, request);
    //     return ResponseEntity.ok().body(updatedArticle);
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteArticle(@PathVariable Long id) {
    //     blogService.delete(id);
    //     return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    // }

    @GetMapping("/favicon.ico")
    public void favicon() {
        // 아무 작업도 하지 않음
    }
}
