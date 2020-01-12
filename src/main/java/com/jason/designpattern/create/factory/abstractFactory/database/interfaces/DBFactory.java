package com.jason.designpattern.create.factory.abstractFactory.database.interfaces;

/**
 * 数据库工厂，同于创建相对应的数据库
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:36
 */
public interface DBFactory {

    Connection createConnection();

    Statement createStatement();

    CloseConnection createClose();
}
