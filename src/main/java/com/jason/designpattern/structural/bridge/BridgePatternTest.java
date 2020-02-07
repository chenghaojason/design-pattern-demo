package com.jason.designpattern.structural.bridge;

import com.jason.commons.exception.NewInstanceException;
import com.jason.commons.utils.ParesXML;
import com.jason.designpattern.structural.bridge.dy.ImplementorA;
import com.jason.designpattern.structural.bridge.dy.RefinedAbstraction;
import com.jason.designpattern.structural.bridge.logger.*;
import com.jason.designpattern.structural.bridge.picture.color.Color;
import com.jason.designpattern.structural.bridge.picture.shape.ShapeAbstract;
import com.jason.designpattern.structural.bridge.video.SystemPlatform;
import com.jason.designpattern.structural.bridge.video.VideoFile;

import java.io.File;
import java.util.Map;

/**
 * 桥接模式测试类
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 10:21
 */
public class BridgePatternTest {
    public static void main(String[] args) throws NewInstanceException {
        // 定义
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.setImplementor(new ImplementorA());
        refinedAbstraction.operation();

        // 图形
        Map<String, Object> map = ParesXML.getPictureInfo(ParesXML.COLOR_PACKAGE, ParesXML.SHAPE_PACKAGE, new File("src/main/resources/structural/bridge-pattern-shape.xml"));
        Color color = (Color) map.get("implementor");
        ShapeAbstract shape = (ShapeAbstract) map.get("abstraction");
        shape.setColor(color);
        shape.draw();
        // 视频播放
        Map<String, Object> videoMap = ParesXML.getPictureInfo(ParesXML.VIDEO_PACKAGE, ParesXML.VIDEO_PACKAGE, new File("src/main/resources/structural/bridge-pattern-video.xml"));
        SystemPlatform systemPlatform = (SystemPlatform) videoMap.get("abstraction");
        VideoFile videoFile = (VideoFile) videoMap.get("implementor");
        systemPlatform.setVideoFile(videoFile);
        systemPlatform.play("java讲义");
        // 输出日志（三个变化的维度）
        SysPlat sysPlat = new LinuxPlatform();
        Languages languages = new PythonLanguages();
        Output output = new OutputToDataBase();
        languages.setOutput(output);
        sysPlat.setLanguages(languages);
        sysPlat.out("测试日志内容");

    }
}
