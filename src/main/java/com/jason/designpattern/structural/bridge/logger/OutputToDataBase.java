package com.jason.designpattern.structural.bridge.logger;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 21:40
 */
public class OutputToDataBase implements Output {
    @Override
    public void loggerOut(String content, String languages, String sys) {
        System.out.println("在" + sys + "系统中，使用" + languages + "语言，输出日志到数据库，日志内容：[" + content + "]");
    }
}
