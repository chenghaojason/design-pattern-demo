package com.jason.designpattern.structural.bridge.logger;

/**
 * 日志输出到文件
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 21:26
 */
public class OutputToFile implements Output {
    @Override
    public void loggerOut(String content, String languages, String sys) {
        System.out.println("在" + sys + "系统中，使用" + languages + "语言，输出日志到文件，日志内容：[" + content + "]");
    }
}
