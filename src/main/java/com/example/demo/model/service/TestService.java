package com.example.demo.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.TestDB;
import com.example.demo.model.repository.TestRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service // 서비스 계층 명시 스프링 내부 자동 등록됨
@Transactional
@RequiredArgsConstructor
public class TestService {
    @Autowired // 객체 주입 자동화
    private TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    // 유저 전체 검색
    public List<TestDB> findAll() {
        return testRepository.findAll();
    }

    public TestDB findByName(String name) {
        return (TestDB) testRepository.findByName(name);
    }
}