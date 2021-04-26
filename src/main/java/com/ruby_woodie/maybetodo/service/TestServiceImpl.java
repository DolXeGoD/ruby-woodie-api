package com.ruby_woodie.maybetodo.service;

import com.ruby_woodie.maybetodo.domain.entity.TestEntity;
import com.ruby_woodie.maybetodo.domain.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    @Override
    public List<TestEntity> getTestList() {
        return testRepository.findAll();
    }
}
