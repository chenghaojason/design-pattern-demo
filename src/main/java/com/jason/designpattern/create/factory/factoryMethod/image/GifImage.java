package com.jason.designpattern.create.factory.factoryMethod.image;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 22:22
 */
public class GifImage extends Image {

    public void gifReader(File file) {
        System.out.println("GIF图片操作");
    }

    public void reader() {
        File file = startReader();
        gifReader(file);
    }
}
