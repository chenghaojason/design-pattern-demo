package com.jason.designpattern.structural.bridge.video;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 16:17
 */
public class Windows extends SystemPlatform {
    @Override
    public void play(String fileName) {
        this.videoFile.decode(fileName, "Windows");
        System.out.println("在Windows系统中播放《" + fileName + "》视频");
    }
}
