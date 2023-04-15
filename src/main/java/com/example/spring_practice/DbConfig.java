package com.example.spring_practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
@Configuration
public class DbConfig {
    private static final String URL = "jdbc:h2:mem:rsa";
    private static final String USER = "sa";
    private static final String PWD = "sa";


    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER,PWD);
            log.info("get connection={}, class={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
