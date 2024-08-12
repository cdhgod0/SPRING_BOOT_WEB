package com.example.demo.model.domain;
import lombok.*; // 어노테이션 자동 생성
import jakarta.persistence.*; // 기존 javax 후속 버전

@Getter // setter는 없음(무분별한 변경 x)
@Entity // User라는 객체와 DB 테이블을 매핑. JPA가 관리
@Table(name = "user") // 테이블 이름을 지정. 없는 경우 클래스이름으로 설정
public class User {
    @Id // 해당 변수가 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 값이 없어도 자동으로 할당
    private Long id;

    @Column(nullable = true) // 테이블의 컬럼 설정 값을 명시
    private String name;

    @Builder // 생성자에 빌더 패턴 적용(불변성)
    public User(){           
    }

    public void setName(String newName) {
        this.name = newName;
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}
