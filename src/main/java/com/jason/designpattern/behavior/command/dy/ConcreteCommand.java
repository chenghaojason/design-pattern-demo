package com.jason.designpattern.behavior.command.dy;

/**
 * 具体命令者
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:20
 */
public class ConcreteCommand implements Command {

    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.action();
    }
}
