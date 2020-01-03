package com.jason.designpattern.factory.abstractFactory.database.interfaces;

import com.jason.commons.beans.db.Connector;

/**
 * 关闭链接
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:41
 */
public interface CloseConnection {
    void close(Connector connector);
}
