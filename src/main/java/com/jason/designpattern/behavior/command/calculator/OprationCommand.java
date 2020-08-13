package com.jason.designpattern.behavior.command.calculator;

/**
 * 抽象命令
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:28
 */
public abstract class OprationCommand {

    protected Opreation opreation;
    public int after;
    public int param;

    /**
     * 执行
     */
    public abstract int execute(int value);

    /**
     * 撤销
     */
    public abstract int undo();
}
