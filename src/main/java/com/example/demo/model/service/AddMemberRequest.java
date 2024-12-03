package com.example.demo.model.service;

import lombok.*; // 어노테이션 자동 생성
import com.example.demo.model.domain.Member;
import jakarta.validation.constraints.*;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data
public class AddMemberRequest {
    
    @NotBlank(message = "Name is required.")
    private String name;

    @NotBlank(message = "Email is required.")
    @Email(message = "Email must be in a valid format.")
    @Pattern(regexp = "^[^\\s]+$", message = "Email must not contain spaces.")
    private String email;

    @NotBlank(message = "Password is required.")
    @Min(value = 8, message = "PASS must be at least 8.")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "Password must not contain spaces and must consist only of English letters and numbers.")
    private String password;

    @NotBlank(message = "Age is required.")
    @Min(value = 19, message = "Age must be at least 19.")
    @Max(value = 90, message = "Age must be at most 90.")
    private String age;

    @NotNull(message = "mobile is required.")
    private String mobile;

    @NotNull(message = "Address is required.")
    private String address;

    public Member toEntity(){ // Board 생성자를 통해 객체 생성
        return Member.builder()
            .name(name)
            .email(email)
            .password(password)
            .age(age)
            .mobile(mobile)
            .address(address)
            .build();
    }
}
