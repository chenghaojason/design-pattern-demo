package com.jason.designpattern.factory.abstractFactory.database.classes;

import com.jason.designpattern.factory.abstractFactory.database.interfaces.CloseConnection;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.Connection;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.DBFactory;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.Statement;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:53
 */
public class MySqlFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        System.out.println("创建 MySql 数据库链接对象");
        return new MySqlConnection();
    }

    @Override
    public Statement createStatement() {
        System.out.println("创建 MySql 数据库语句对象");
        return new MySqlStatement();
    }

    @Override
    public CloseConnection createClose() {
        System.out.println("创建 MySql 数据库关闭对象");
        return new MySqlClose();
    }
}
