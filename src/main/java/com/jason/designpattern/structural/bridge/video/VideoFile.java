package com.jason.designpattern.structural.bridge.video;

/**
 * 视频文件接口
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 15:59
 */
public interface VideoFile {

    /**
     * 视频文件解码
     *
     * @param fileName   文件名
     * @param systemType 系统平台
     */
    void decode(String fileName, String systemType);
}
