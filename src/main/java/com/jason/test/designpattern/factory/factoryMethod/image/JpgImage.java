package com.jason.test.designpattern.factory.factoryMethod.image;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 22:42
 */
public class JpgImage extends Image {
    public void reader() {
        File file = startReader();
        jpgReader(file);
    }

    public void jpgReader(File file) {
        System.out.println("JPG图片操作");
    }
}
