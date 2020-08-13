package com.jason.designpattern.behavior.command.tv;

/**
 * 打开电视机具体命令
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:41
 */
public class OpenTVCommand implements AbstractCommand {

    private TelevisionReceiver receiver;

    public OpenTVCommand() {
        receiver = new TelevisionReceiver();
    }

    @Override
    public void execute() {
        receiver.open();
    }
}
