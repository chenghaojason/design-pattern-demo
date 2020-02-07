package com.jason.designpattern.structural.bridge.logger;

/**
 * 支持日志输出的操作系统
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 21:15
 */
public abstract class SysPlat {
    protected Languages languages;


    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public abstract void out(String content);
}
