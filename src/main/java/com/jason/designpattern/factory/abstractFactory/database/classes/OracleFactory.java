package com.jason.designpattern.factory.abstractFactory.database.classes;

import com.jason.designpattern.factory.abstractFactory.database.interfaces.CloseConnection;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.Connection;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.DBFactory;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.Statement;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:50
 */
public class OracleFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        System.out.println("创建Oracle数据库链接对象");
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        System.out.println("创建Oracle数据库语句对象");
        return new OracleStatement();
    }

    @Override
    public CloseConnection createClose() {
        System.out.println("创建Oracle数据库关闭对象");
        return new OracleClose();
    }
}
