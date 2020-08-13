package com.jason.designpattern.behavior.command.tv;

/**
 * 切换频道具体命令类
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:43
 */
public class ChangeChannelCommand implements AbstractCommand {
    private TelevisionReceiver receiver;

    public ChangeChannelCommand() {
        receiver = new TelevisionReceiver();
    }

    @Override
    public void execute() {
        receiver.changeChannel();
    }
}
