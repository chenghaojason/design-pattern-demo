package com.jason.designpattern.structural.proxy.user;

import java.util.ArrayList;
import java.util.List;

/**
 * 真实用户操作
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 17:21
 */
public class RealUser implements AbstractUser {

    @Override
    public void login() {
        System.out.println("登陆成功");
    }

    @Override
    public List<Object> selectDataList() {
        System.out.println("查看业务数据");
        return new ArrayList<>();
    }

    @Override
    public void updateData() {
        System.out.println("修改数据");
    }

    @Override
    public void deleteData() {
        System.out.println("删除数据");
    }

    @Override
    public void addData() {
        System.out.println("添加数据");
    }

    @Override
    public void setLevel(int level) {

    }

}
