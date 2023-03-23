package com.example.demo.apis.test;

import com.example.demo.repositories.TestModel;
import com.example.demo.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@RequestMapping("/")
public class TestApi implements TestDoc {

    @Autowired
    TestRepository testRepository;

    @Override
    @GetMapping
    public List<TestModel> QueryTestList() {
        return testRepository.findAll();
    }
}
