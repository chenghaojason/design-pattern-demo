package com.jason.designpattern.structural.facade.jdbc;

import java.sql.*;

/**
 * 通过JDBC外观类创建链接执行SQL
 *
 * @author ChenHol.Wong
 * @create 2020/8/6 21:55
 */
public class JDBCFacade {
    private Connection connection;
    private Statement statement;

    public void open(String driver, String url, String userName, String password) {
        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int update(String sql) {
        try {
            return statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public ResultSet query(String sql) {
        try {
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
