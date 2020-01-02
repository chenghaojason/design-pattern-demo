package com.jason.designpattern.factory.simpleFactory.right;

/**
 * @author ChenHol.Wong
 * @create 2019/12/15 - 20:44
 */
public class Administrntor extends User {
    public void visitContent() {
        System.out.println("管理员可以操作所有");
    }
}
