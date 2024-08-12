package com.example.demo.model.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity // TestDB라는 객체와 DB 테이블을 매핑. JPA가 관리
@Table(name = "testdb")
@Data
public class TestDB {
    @Id // 해당 변수가 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 값이 없어도 자동으로 할당
    private Long id;

    @Column(nullable = true) // 테이블의 컬럼 설정 값을 명시
    private String name;

    @Builder // 생성자에 빌더 패턴 적용(불변성)
    public TestDB(){           
    }
}
