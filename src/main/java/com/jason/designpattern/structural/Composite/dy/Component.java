package com.jason.designpattern.structural.Composite.dy;

/**
 * 抽象构件类
 * 透明组合模式
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 15:13
 */
public abstract class Component {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int i);

    public abstract void operation();
}
