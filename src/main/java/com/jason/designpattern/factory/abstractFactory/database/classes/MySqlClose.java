package com.jason.designpattern.factory.abstractFactory.database.classes;

import com.jason.commons.beans.db.Connector;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.CloseConnection;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:50
 */
public class MySqlClose implements CloseConnection {
    @Override
    public void close(Connector connector) {
        System.out.println("MySql数据库链接已关闭");
    }
}
