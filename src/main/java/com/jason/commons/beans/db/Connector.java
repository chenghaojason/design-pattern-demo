package com.jason.commons.beans.db;

import java.time.LocalDateTime;

/**
 * 链接对象
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:37
 */
public class Connector {
    private DataBase dataBase; //数据库对象
    private LocalDateTime connectionTime;// 链接时间
    private long connectionOutTime;//链接超时时间

    @Override
    public String toString() {
        return "Connector{" +
                "dataBase=" + dataBase +
                ", connectionTime=" + connectionTime +
                ", connectionOutTime=" + connectionOutTime +
                '}';
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public LocalDateTime getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(LocalDateTime connectionTime) {
        this.connectionTime = connectionTime;
    }

    public long getConnectionOutTime() {
        return connectionOutTime;
    }

    public void setConnectionOutTime(long connectionOutTime) {
        this.connectionOutTime = connectionOutTime;
    }
}
