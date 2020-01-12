package com.jason.designpattern.create.factory.abstractFactory.database.classes;

import com.jason.commons.beans.db.Connector;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.CloseConnection;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:46
 */
public class OracleClose implements CloseConnection {
    @Override
    public void close(Connector connector) {
        System.out.println("oracle数据库链接已关闭");
    }
}
