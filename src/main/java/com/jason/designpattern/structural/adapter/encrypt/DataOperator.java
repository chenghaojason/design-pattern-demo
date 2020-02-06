package com.jason.designpattern.structural.adapter.encrypt;

/**
 * 对象适配器
 * 目标抽象类-数据库操作类
 *
 * @author ChenHol.Wong
 * @create 2020/2/6 10:30
 */
public abstract class DataOperator {
    private String password;

    public abstract String encrypt(int key,String ps);

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
