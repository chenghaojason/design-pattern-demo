package com.jason.designpattern.structural.bridge.logger;

/**
 * Java语言
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 21:32
 */
public class JavaLanguage extends Languages {
    @Override
    public void printLog(String content, String sys) {
        this.output.loggerOut(content, "Java", sys);
    }
}
