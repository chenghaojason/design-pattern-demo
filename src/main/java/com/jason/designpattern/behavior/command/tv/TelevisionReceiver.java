package com.jason.designpattern.behavior.command.tv;

/**
 * 调用者-电视机
 *
 * @author ChenHol.Wong
 * @create 2020/8/12 22:36
 */
public class TelevisionReceiver {

    public void open() {
        System.out.println(" open TV ...");
    }

    public void changeChannel() {
        System.out.println(" change channel ...");
    }

    public void close() {
        System.out.println(" close TV ...");
    }

}
