package com.jason.designpattern.behavior.command.tv;

/**
 * 调用者类-遥控器
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:44
 */
public class Controller {

    private AbstractCommand openCommand, changeChannelCommand, closeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand changeChannelCommand, AbstractCommand closeCommand) {
        this.openCommand = openCommand;
        this.changeChannelCommand = changeChannelCommand;
        this.closeCommand = closeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void changeChannel() {
        changeChannelCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }
}
