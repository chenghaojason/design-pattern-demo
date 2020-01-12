package com.jason.designpattern.create.factory.abstractFactory.database.classes;

import com.jason.commons.beans.db.Connector;
import com.jason.commons.beans.db.DataBase;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.Connection;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:43
 */
public class OracleConnection implements Connection {
    @Override
    public Connector createConnection(DataBase dataBase) {
        System.out.println("oracle数据库已打开链接");
        return new Connector();
    }
}
