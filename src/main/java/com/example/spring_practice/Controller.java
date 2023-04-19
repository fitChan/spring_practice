package com.example.spring_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final DbConfig dbConfig;

    public Controller(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }


    @GetMapping("/getENC")
    public void test(){
        dbConfig.getENC();
    }
}
