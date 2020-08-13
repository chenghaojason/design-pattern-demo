package com.jason.designpattern.behavior.command;

import com.jason.designpattern.behavior.command.calculator.AdditionCommand;
import com.jason.designpattern.behavior.command.calculator.CalculatorForm;
import com.jason.designpattern.behavior.command.calculator.MultiplicationCommand;
import com.jason.designpattern.behavior.command.calculator.SubtractionCommand;
import com.jason.designpattern.behavior.command.dy.ConcreteCommand;
import com.jason.designpattern.behavior.command.dy.Invoker;
import com.jason.designpattern.behavior.command.tv.ChangeChannelCommand;
import com.jason.designpattern.behavior.command.tv.CloseCommand;
import com.jason.designpattern.behavior.command.tv.Controller;
import com.jason.designpattern.behavior.command.tv.OpenTVCommand;

/**
 * @author ChenHol.Wong
 * @create 2020/8/12 22:22
 */
public class CommandTest {
    public static void main(String[] args) {

        // 基本定义的测试
        Invoker invoker = new Invoker(new ConcreteCommand());
        invoker.call();

        // 电视机命令模式测试
        OpenTVCommand openTVCommand = new OpenTVCommand();
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand();
        CloseCommand closeCommand = new CloseCommand();

        Controller controller = new Controller(openTVCommand, changeChannelCommand, closeCommand);

        controller.open();
        controller.changeChannel();
        controller.close();

        // 计算器示例测试
        CalculatorForm calculatorForm = new CalculatorForm();
        AdditionCommand additionCommand = new AdditionCommand(0);
        calculatorForm.setCommand(additionCommand);

        calculatorForm.compute(10);
        calculatorForm.compute(15);
        calculatorForm.undo();

        SubtractionCommand subtractionCommand = new SubtractionCommand(additionCommand.after);
        calculatorForm.setCommand(subtractionCommand).compute(5);
        MultiplicationCommand multiplicationCommand = new MultiplicationCommand(subtractionCommand.after);
        calculatorForm.setCommand(multiplicationCommand).compute(7);
        calculatorForm.undo();

    }
}
