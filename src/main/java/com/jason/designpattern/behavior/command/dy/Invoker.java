package com.jason.designpattern.behavior.command.dy;

/**
 * 调用者，也叫做请求者
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:19
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的执行方法
    public void call() {
        command.execute();
    }
}
