package com.jason.designpattern.structural.bridge.video;
/**
 * 系统平台抽象接口
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 16:15
 */
public abstract class SystemPlatform {
    protected VideoFile videoFile;

    public void setVideoFile(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 播放文件
     *
     * @param fileName 文件名
     */
    public abstract void play(String fileName);
}
