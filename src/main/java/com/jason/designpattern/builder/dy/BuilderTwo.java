package com.jason.designpattern.builder.dy;

/** 具体建造者
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:13
 */
public class BuilderTwo extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("建造者 two 生产部件 A ");
    }

    @Override
    public void buildPartB() {
        System.out.println("建造者 two 生产部件 B ");
    }

    @Override
    public void buildPartC() {
        System.out.println("建造者 two 生产部件 C ");
    }
}
