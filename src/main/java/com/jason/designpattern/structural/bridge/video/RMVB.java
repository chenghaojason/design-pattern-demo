package com.jason.designpattern.structural.bridge.video;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 16:11
 */
public class RMVB implements VideoFile{
    @Override
    public void decode(String fileName, String systemType) {
        System.out.println("在" + systemType + "系统中解码 RMVB 格式文件，文件名：" + fileName);
    }
}
