package com.jason.designpattern.behavior.command.calculator;

import java.math.BigDecimal;

/**
 * 接收者-可以看作是处理器
 * 简单处理加减乘除，异常情况忽略不计
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:21
 */
public class Opreation {
    private BigDecimal base = new BigDecimal(0);

    public Opreation() {
    }

    public Opreation(int base) {
        this.base = new BigDecimal(base);
    }

    /**
     * 加法
     */
    public int addition(int value) {
        base = base.add(new BigDecimal(value));
        return base.intValue();
    }

    /**
     * 减法
     */
    public int subtraction(int value) {
        base = base.subtract(new BigDecimal(value));
        return base.intValue();
    }

    /**
     * 乘法
     */
    public int multiplication(int value) {
        base = base.multiply(new BigDecimal(value));
        return base.intValue();
    }

    /**
     * 除法
     */
    public int division(int value) {
        base = base.divide(new BigDecimal(value));
        return base.intValue();
    }
}
