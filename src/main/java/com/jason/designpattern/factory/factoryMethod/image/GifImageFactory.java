package com.jason.designpattern.factory.factoryMethod.image;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 22:29
 */
public class GifImageFactory extends ImageFactory {
    public Image createImage() {
        System.out.println("创建GIF图片读操作器");
        return new GifImage();
    }
}
