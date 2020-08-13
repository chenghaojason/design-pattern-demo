package com.jason.designpattern.behavior.command.calculator;

/**
 * 乘法命令
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:42
 */
public class MultiplicationCommand extends OprationCommand {
    public MultiplicationCommand(int base) {
        opreation = new Opreation(base);
    }

    @Override
    public int execute(int value) {
        param=value;
        return after = opreation.multiplication(value);
    }

    @Override
    public int undo() {
        return after = opreation.division(param);
    }
}
