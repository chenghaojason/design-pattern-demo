package com.jason.designpattern.create.factory.abstractFactory.database.classes;

import com.jason.commons.beans.db.Sql;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.Statement;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:49
 */
public class MySqlStatement implements Statement {
    @Override
    public Sql createSql() {
        System.out.println("获取 MySql Sql 语句");
        return new Sql();
    }

    @Override
    public String getFinalSql() {
        return createSql().getFinalSql();
    }
}
