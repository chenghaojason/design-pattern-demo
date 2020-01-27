package com.jason.designpattern.create.prototype.dy;

/**
 * 抽象原型类
 */
public abstract class Prototype implements Cloneable {
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
