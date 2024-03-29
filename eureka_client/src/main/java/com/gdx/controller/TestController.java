package com.gdx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    String port;


    @Autowired
    private TestService testService;


    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "端口号：" + port + ",name：" + name+"，"+testService.test();
    }
}
