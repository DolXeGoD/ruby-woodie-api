package com.ruby_woodie.maybetodo.controller;

import com.ruby_woodie.maybetodo.domain.entity.TestEntity;
import com.ruby_woodie.maybetodo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping(value = "/all")
    public List<TestEntity> testAll() {
        return testService.getTestList();
    }

}
