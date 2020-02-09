package com.jason.designpattern.structural.Composite.warehouse;

/**
 * 药品
 * 叶子构件类
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 19:59
 */
public class Medicinal extends Things {
    public Medicinal(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println(super.getName() + "可以治病");
    }
}
