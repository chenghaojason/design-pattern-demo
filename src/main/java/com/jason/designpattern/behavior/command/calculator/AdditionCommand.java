package com.jason.designpattern.behavior.command.calculator;

/**
 * 加法命令
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:30
 */
public class AdditionCommand extends OprationCommand {

    public AdditionCommand(int base) {
        opreation = new Opreation(base);
    }

    @Override
    public int execute(int value) {
        param=value;
        return after = opreation.addition(value);
    }

    @Override
    public int undo() {
        return after = opreation.subtraction(param);
    }
}
