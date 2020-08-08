package com.jason.designpattern.structural.proxy.user;

import java.util.List;

/**
 * 抽象用户
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 17:15
 */
public interface AbstractUser {

    /**
     * 登录
     */
    void login();

    /**
     * 查看数据
     */
    List<Object> selectDataList();

    /**
     * 修改数据
     */
    void updateData();

    /**
     * 删除数据
     */
    void deleteData();

    /**
     * 新增数据
     */
    void addData();

    /**
     * 设置用户级别
     *
     * @param level
     */
    void setLevel(int level);

}
