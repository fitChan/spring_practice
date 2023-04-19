package com.example.spring_practice;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @jakarta.persistence.Entity
public class Entity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idx;

    private String PRIVATE_KEY;
    private String PUBLIC_KEY;
    private String ENC_TEXT;

}
