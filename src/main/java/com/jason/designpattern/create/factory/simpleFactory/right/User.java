package com.jason.designpattern.create.factory.simpleFactory.right;

/**
 * 用户权限控制-抽线用户
 *
 * @author ChenHol.Wong
 * @create 2019/12/15 - 20:39
 */
public abstract class User {

    public void updateUserInfo() {
        System.out.println("修改用户信息");
    }

    public abstract void visitContent();
}
