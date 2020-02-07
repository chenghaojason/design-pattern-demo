package com.jason.designpattern.structural.bridge.logger;

/**
 * 日志输出方式
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 21:11
 */
public interface Output {


    void loggerOut(String content, String languages, String sys);
}
