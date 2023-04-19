package com.example.spring_practice;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
@org.springframework.stereotype.Service
public class Service {
    Connection con = null;
    PreparedStatement pstmt = null;

//    private Entity insertData(Entity entity) throws SQLException {
//        String sql = "insert into member(member_id, money) values(?, ?)";
//
//        try {
//            con = getConnection();
//            pstmt = con.prepareStatement(sql);
//            pstmt.setInt(1, entity.getIdx());
//            pstmt.setString(2, entity.getTest());
//            pstmt.executeUpdate();
//            return entity;
//        } catch (
//                SQLException e) {
//            log.error("db error", e);
//            throw e;
//        } finally {
//            close(con, pstmt, null);
//        }
//    }
//
//    private void close(Connection con, PreparedStatement stmt, ResultSet rs) {
//        if (rs != null) {
//            try {
//                rs.close();
//            } catch (SQLException e) {
//                log.info("error", e);
//            }
//        }
//        if (stmt != null) {
//            try {
//                stmt.close();
//            } catch (SQLException e) {
//                log.info("error", e);
//            }
//        }
//        if (con != null) {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                log.info("error", e);
//            }
//        }
//    }


    private Connection getConnection() {
        return DbConfig.getConnection();
    }
}
