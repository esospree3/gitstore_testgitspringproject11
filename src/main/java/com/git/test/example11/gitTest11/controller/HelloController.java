package com.git.test.example11.gitTest11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping()
    public String hello() {
        return "hello..... ";
    }

    @GetMapping("/hi/{message}")
    public String hi(@PathVariable String message) {
        return "hello...by some one here ... " + message + " ...welcome...";
    }

    @GetMapping("/hello111")
    public String hello111() {
        return "hello.....111 ";
    }

    @GetMapping("/hello333")
    public String hello333() {
        return "hello.....333 ";
    }

}
