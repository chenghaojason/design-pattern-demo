package com.jason.designpattern.structural.bridge.logger;

/**
 * windows系统
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 21:18
 */
public class WindowsPlatform extends SysPlat {
    @Override
    public void out(String content) {
        this.languages.printLog(content, "Windows");
    }
}
