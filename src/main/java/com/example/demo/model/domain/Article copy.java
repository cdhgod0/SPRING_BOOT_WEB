// package com.example.demo.model.domain;

// import lombok.*; // 어노테이션 자동 생성
// import jakarta.persistence.*; // 기존 javax 후속 버전

// @Getter // setter는 없음(무분별한 변경 x)
// @Entity // 아래 객체와 DB 테이블을 매핑. JPA가 관리
// @Table(name = "article") // 테이블 이름을 지정. 없는 경우 클래스이름으로 설정
// @NoArgsConstructor(access = AccessLevel.PROTECTED)

// public class Article2 {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 1씩 증가
//     @Column(name = "id", updatable = false) // 수정 x
//     private Long id;

//     @Column(name = "title", nullable  = false) // null x
//     private String title = "";

//     @Column(name = "content", nullable = false)
//     private String content = "";

//     @Builder // 생성자에 빌더 패턴 적용(불변성)
//     public Article(String title, String content){
//         this.title = title;
//         this.content = content;
//     }   

//     public void update(String title2, String content2) {
//         this.title = title2;
//         this.content = content2;
//         throw new UnsupportedOperationException("Unimplemented method 'update'");
        
//     }
// }
