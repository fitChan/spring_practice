package com.example.spring_practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Long> {

    @Query(value = "select * from rsaTable", nativeQuery = true)
    List<Entity> findEntity();
}
