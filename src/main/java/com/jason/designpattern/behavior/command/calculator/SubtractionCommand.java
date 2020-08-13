package com.jason.designpattern.behavior.command.calculator;

/**
 * 减法命令
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:37
 */
public class SubtractionCommand extends OprationCommand {
    public SubtractionCommand(int base) {
        opreation = new Opreation(base);
    }

    @Override
    public int execute(int value) {
        param = value;
        return after = opreation.subtraction(value);
    }

    @Override
    public int undo() {
        return after = opreation.addition(param);
    }
}
