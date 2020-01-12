package com.jason.designpattern.create.factory.factoryMethod.image;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 22:21
 */
public abstract class Image {
    public abstract void reader();

    public File startReader() {
        System.out.println("开始读取图片");
        return new File("");
    }
}
