package com.jason.designpattern.factory.abstractFactory.database.interfaces;

import com.jason.commons.beans.db.Sql;

/**
 * 数据库语句抽象对象
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:25
 */
public interface Statement {
    // 创建SQL
    Sql createSql();

    // 获取最终SQL
    String getFinalSql();
}
