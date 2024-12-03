package com.example.demo.model.service;

import lombok.*; // 어노테이션 자동 생성
// import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data
public class AddArticleRequest {
    private String title;
    private String content;
    private String user;
    private String newdate;
    private String count;
    private String likec;

    public Board toEntity(){ // Board 생성자를 통해 객체 생성
        return Board.builder()
            .title(title)
            .content(content)
            .user(user)
            .newdate(newdate)
            .count(count)
            .likec(likec)
            .build();
    }

    // public Article toEntity(){ // Article 생성자를 통해 객체 생성
    //     return Article.builder()
    //         .title(title)
    //         .content(content)
    //         .build();
    // }
}
