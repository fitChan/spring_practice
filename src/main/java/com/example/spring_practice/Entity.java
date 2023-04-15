package com.example.spring_practice;

import lombok.Data;

@Data
public class Entity {

    private Integer idx;

    private String test;

    public Entity() {
    }

    public Entity(Integer idx, String test) {
        this.idx = idx;
        this.test = test;
    }
}
