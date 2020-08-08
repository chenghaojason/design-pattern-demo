package com.jason.designpattern.structural.proxy.user;

import java.util.List;

/**
 * 代理用户
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 17:23
 */
public class ProxyUser implements AbstractUser {


    private int level = 0;
    private RealUser realUser = new RealUser();

    @Override
    public void login() {
        realUser.login();
    }

    @Override
    public List<Object> selectDataList() {
        return realUser.selectDataList();
    }

    @Override
    public void updateData() {
        if (level < 1) {
            System.out.println("对不起，你没有权限修改");
        } else {
            realUser.updateData();
        }
    }

    @Override
    public void deleteData() {
        if (level < 1) {
            System.out.println("对不起，你没有权限删除");
        } else {
            realUser.deleteData();
        }
    }

    @Override
    public void addData() {
        if (level < 1) {
            System.out.println("对不起，你没有权限添加数据");
        } else {
            realUser.addData();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
