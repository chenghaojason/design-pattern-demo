package com.jason.designpattern.structural.bridge.video;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 16:35
 */
public class Unix extends SystemPlatform {
    @Override
    public void play(String fileName) {
        this.videoFile.decode(fileName, "Unix");
        System.out.println("在Unix系统中播放《" + fileName + "》视频");
    }
}
