package com.jason.designpattern.behavior.command.tv;

/**
 * 关闭电视机具体命令类
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:44
 */
public class CloseCommand implements AbstractCommand {
    private TelevisionReceiver receiver;

    public CloseCommand() {
        receiver = new TelevisionReceiver();
    }

    @Override
    public void execute() {
        receiver.close();
    }
}
