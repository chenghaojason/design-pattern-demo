package com.jason.designpattern.structural.bridge.video;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 16:13
 */
public class ASF implements VideoFile {
    @Override
    public void decode(String fileName, String systemType) {
        System.out.println("在" + systemType + "系统中解码 ASF 格式文件，文件名：" + fileName);
    }
}
