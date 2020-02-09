package com.jason.designpattern.structural.Composite.file;

/**
 * 抽象构件类
 * 抽象文件
 * 透明组合模式
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 20:21
 */
public abstract class AbstractFile {


    /**
     * 文件名字
     */
    protected String fileName;
    /**
     * 文件类型
     */
    protected String fileType;
    /**
     * 文件大小，单位kb
     */
    protected int fileSize;

    public AbstractFile() {
    }

    public AbstractFile(String fileName) {
        this.fileName = fileName;
    }

    public AbstractFile(String fileName, String fileType, int fileSize) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    /**
     * 添加文件
     *
     * @param file 文件
     */
    public abstract void add(AbstractFile file);

    /**
     * 删除文件
     *
     * @param file 文件
     */
    public abstract void remove(AbstractFile file);

    /**
     * 浏览文件
     */
    public abstract void display();

}
