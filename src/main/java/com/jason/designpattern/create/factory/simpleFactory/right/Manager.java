package com.jason.designpattern.create.factory.simpleFactory.right;

/**
 * @author ChenHol.Wong
 * @create 2019/12/15 - 20:43
 */
public class Manager extends User {
    public void visitContent() {
        System.out.println("经理可以访问所有员工的工资、业绩等内容");
    }
}
