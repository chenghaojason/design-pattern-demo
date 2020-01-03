package com.jason.commons.beans.db;

import com.jason.commons.beans.db.DataBase;

import java.util.TreeMap;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:26
 */
public class Sql {
    private DataBase dateBase;//数据库对象
    private String preparedSql;// 编译之前的sql
    private String finalSql;//最终生成的sql
    private TreeMap<String, Object> param;//参数

    @Override
    public String toString() {
        return "Sql{" +
                "dateBase=" + dateBase +
                ", preparedSql='" + preparedSql + '\'' +
                ", finalSql='" + finalSql + '\'' +
                ", param=" + param +
                '}';
    }

    public DataBase getDateBase() {
        return dateBase;
    }

    public void setDateBase(DataBase dateBase) {
        this.dateBase = dateBase;
    }

    public String getPreparedSql() {
        return preparedSql;
    }

    public void setPreparedSql(String preparedSql) {
        this.preparedSql = preparedSql;
    }

    public String getFinalSql() {
        return finalSql;
    }

    public void setFinalSql(String finalSql) {
        this.finalSql = finalSql;
    }

    public TreeMap<String, Object> getParam() {
        return param;
    }

    public void setParam(TreeMap<String, Object> param) {
        this.param = param;
    }
}
