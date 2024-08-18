// package com.example.demo.model.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.stereotype.Service;
// import com.example.demo.model.domain.Article;
// import com.example.demo.model.repository.BlogRepository;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @Service
// public class BlogService {
//     private final BlogRepository blogRepository;

//     public Article save(AddArticleRequest request){
//         return blogRepository.save(request.toEntity());
//     }

//     public Optional<Article> findById(Long id) {
//         return blogRepository.findById(id);
//     }

//     public List<Article> findAll() {
//         return blogRepository.findAll();
//     }

//     public Article update(Long id, AddArticleRequest request) {
//         return blogRepository.findById(id)
//             .map(article -> {
//                 article.update(request.getTitle(), request.getContent());
//                 return blogRepository.save(article);
//             })
//             .orElseThrow(() -> new IllegalArgumentException("해당 글이 없습니다. id=" + id));
//     }

//     public void delete(Long id) {
//         blogRepository.deleteById(id);
//     }
// }
