package com.jason.designpattern.behavior.command.calculator;

/**
 * 计算器界面类
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:45
 */
public class CalculatorForm {
    private OprationCommand command;

    public CalculatorForm setCommand(OprationCommand command) {
        this.command = command;
        return this;
    }

    public void compute(int value) {
        System.out.println("执行运算，结果：" + command.execute(value));
    }

    public void undo() {
        System.out.println("撤销后结果：" + command.undo());
    }
}
