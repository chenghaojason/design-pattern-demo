package com.jason.designpattern.structural.Composite.file;

import com.jason.commons.exception.CompositeOperationException;

/**
 * @author ChenHol.Wong
 * @create 2020/2/8 20:29
 */
public class VideoFile extends AbstractFile {
    /**
     * 视频格式
     */
    private String videoType;

    public String getVideoType() {
        return videoType;
    }

    public VideoFile(String fileName, String fileType, int fileSize, String videoType) {
        super(fileName, fileType, fileSize);
        this.videoType = videoType;
    }

    @Override
    public void add(AbstractFile file) {
        try {
            throw new CompositeOperationException("视频不支持添加");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
    }

    @Override
    public void remove(AbstractFile file) {
        try {
            throw new CompositeOperationException("视频不支持移除");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
    }

    @Override
    public void display() {
        System.out.println("通过视频播放器播放视频：" + fileName + "（文件类型：" + fileType + "，文件大小：" + fileSize + "kb，视频格式：" + videoType + "）");
    }
}
