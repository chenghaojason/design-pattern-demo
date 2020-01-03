package com.jason.designpattern.factory.abstractFactory.database.classes;

import com.jason.commons.beans.db.Sql;
import com.jason.designpattern.factory.abstractFactory.database.interfaces.Statement;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:45
 */
public class OracleStatement implements Statement {
    @Override
    public Sql createSql() {
        System.out.println("创建oracle SQL 语句");
        return new Sql();
    }

    @Override
    public String getFinalSql() {
        return createSql().getFinalSql();
    }
}
