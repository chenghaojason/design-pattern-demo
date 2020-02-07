package com.jason.designpattern.structural.bridge.video;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 16:20
 */
public class Linux extends SystemPlatform {
    @Override
    public void play(String fileName) {
        this.videoFile.decode(fileName, "Linux");
        System.out.println("在Linux系统中播放《" + fileName + "》视频");
    }
}
