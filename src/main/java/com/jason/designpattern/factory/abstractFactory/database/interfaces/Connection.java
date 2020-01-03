package com.jason.designpattern.factory.abstractFactory.database.interfaces;

import com.jason.commons.beans.db.Connector;
import com.jason.commons.beans.db.DataBase;

/**
 * 数据库链接抽象对象
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:33
 */
public interface Connection {

    /**
     * 创建链接
     */
    Connector createConnection(DataBase dataBase);

}
