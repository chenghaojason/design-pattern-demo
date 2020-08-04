package com.jason.designpattern.structural.Decorator.dy;

/**
 * 可以随意变化的类-抽象装饰类
 * 主要的类
 *
 * @author ChenHol.Wong
 * @create 2020/8/4 22:44
 */
public class Change implements TransForm {

    private TransForm transForm;

    public Change(TransForm transForm) {
        this.transForm = transForm;
    }

    @Override
    public void move() {
        transForm.move();
    }
}
