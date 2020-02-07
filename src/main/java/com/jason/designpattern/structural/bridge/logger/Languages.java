package com.jason.designpattern.structural.bridge.logger;

/**
 * 支持日志输出的语言平台
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 21:14
 */
public abstract class Languages {
    protected Output output;

    public void setOutput(Output output) {
        this.output = output;
    }

    public abstract void printLog(String content, String sys);
}
