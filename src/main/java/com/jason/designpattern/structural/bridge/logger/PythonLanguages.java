package com.jason.designpattern.structural.bridge.logger;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 21:38
 */
public class PythonLanguages extends Languages {
    @Override
    public void printLog(String content, String sys) {
        this.output.loggerOut(content, "Python", sys);
    }
}
