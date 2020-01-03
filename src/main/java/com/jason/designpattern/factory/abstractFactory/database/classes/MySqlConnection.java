package com.jason.designpattern.factory.abstractFactory.database.classes;

import com.jason.commons.beans.db.Connector;
import com.jason.commons.beans.db.DataBase;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.Connection;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:47
 */
public class MySqlConnection implements Connection {
    @Override
    public Connector createConnection(DataBase dataBase) {
        System.out.println("创建MySql数据库链接");
        return new Connector();
    }
}
