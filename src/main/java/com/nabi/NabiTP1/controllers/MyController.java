package com.nabi.NabiTP1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myController/")
public class MyController {

    @GetMapping("hello")
    public String sayHello(){
        return "hello";
    }
}
