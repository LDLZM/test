package com.ldl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
