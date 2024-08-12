package com.example.demo.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long>{
}
