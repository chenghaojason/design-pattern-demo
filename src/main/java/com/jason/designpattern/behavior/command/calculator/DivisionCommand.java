package com.jason.designpattern.behavior.command.calculator;

/**
 * 除法命令
 *
 * @author ChenHol.Wong
 * @create 2020/8/13 20:43
 */
public class DivisionCommand extends OprationCommand {
    public DivisionCommand(int base) {
        opreation = new Opreation(base);
    }

    @Override
    public int execute(int value) {
        param = value;
        return after = opreation.division(value);
    }

    @Override
    public int undo() {
        return after = opreation.multiplication(param);
    }
}
