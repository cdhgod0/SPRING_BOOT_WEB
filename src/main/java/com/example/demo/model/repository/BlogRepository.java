package com.example.demo.model.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.domain.Article;

@Repository
public interface BlogRepository extends JpaRepository<Article, Long>{
    // List<Article> findAll();
}

