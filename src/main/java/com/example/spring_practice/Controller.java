package com.example.spring_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/as")
    public String test(){
        return "HELLO CHAN";
    }
}
