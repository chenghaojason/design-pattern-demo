package com.jason.commons.beans.db;

import com.jason.designpattern.factory.abstractFactory.database.interfaces.DBFactory;

/**
 * 抽象工厂中数据库配置信息
 *
 * @author ChenHol.Wong
 * @create 2020/1/3 - 23:04
 */
public class DataBaseConfiguration {
    private DBFactory dbFactory;

    private DataBase dataBase;

    public DBFactory getDbFactory() {
        return dbFactory;
    }

    public void setDbFactory(DBFactory dbFactory) {
        this.dbFactory = dbFactory;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
