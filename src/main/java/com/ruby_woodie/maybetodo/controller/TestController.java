package com.ruby_woodie.maybetodo.controller;

import com.ruby_woodie.maybetodo.domain.entity.TestEntity;
import com.ruby_woodie.maybetodo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping
    public String hello(Model model) {
        List<TestEntity> testList = testService.getTestList();
        model.addAttribute("testList", testList);
        return "list";
    }

}
