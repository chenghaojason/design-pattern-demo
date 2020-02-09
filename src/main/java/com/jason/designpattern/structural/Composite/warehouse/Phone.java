package com.jason.designpattern.structural.Composite.warehouse;

/**
 * 手机
 * 叶子构件类
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 19:55
 */
public class Phone extends Things {
    public Phone(String name) {
        super(name);
    }

    @Override
    public void use() {
        call();
    }

    private void call() {
        System.out.println("使用" + this.getName() + "牌手机打电话");
    }
}
