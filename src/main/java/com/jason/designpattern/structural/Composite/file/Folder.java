package com.jason.designpattern.structural.Composite.file;

import java.util.ArrayList;

/**
 * 容器构件类
 * 文件夹
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 20:33
 */
public class Folder extends AbstractFile {

    private ArrayList<AbstractFile> list = new ArrayList<>();
    private String url;

    public String getUrl() {
        return url;
    }

    public Folder(String fileName, String url) {
        super(fileName);
        this.url = url;
    }

    private Folder(String fileName, String fileType, int fileSize) {
        super(fileName, fileType, fileSize);
    }

    @Override
    public void add(AbstractFile file) {
        list.add(file);
        if (file instanceof Folder) {
            System.out.println("新建文件夹（文件夹名：" + fileName + "   文件夹路径：" + url + "）");
        } else {
            System.out.println("向文件夹[ " + fileName + " ]添加文件（" + file.fileName + "）");
        }
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("移除文件夹" + fileName + "中的文件（" + file.fileName + "）");
    }

    @Override
    public void display() {
        for (AbstractFile file : list) {
            file.display();
        }
    }
}
