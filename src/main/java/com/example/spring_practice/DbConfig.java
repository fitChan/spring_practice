package com.example.spring_practice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@Slf4j @Service
@RequiredArgsConstructor
public class DbConfig {
    private static final String URL = "jdbc:h2:mem:rsa";
    private static final String USER = "sa";
    private static final String PWD = "sa";

    private final Repository repository;

    @Transactional
    public void getENC() {
        try {
            List<Entity> rsa = repository.findEntity();
            System.out.println(rsa);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PWD);
            log.info("get connection={}, class={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
