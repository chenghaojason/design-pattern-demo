package com.jason.designpattern.structural.bridge.logger;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 21:37
 */
public class LinuxPlatform extends SysPlat {
    @Override
    public void out(String content) {
        this.languages.printLog(content, "Linux");
    }
}
