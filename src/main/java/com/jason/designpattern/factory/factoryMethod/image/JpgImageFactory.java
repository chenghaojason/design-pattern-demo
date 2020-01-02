package com.jason.designpattern.factory.factoryMethod.image;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 22:46
 */
public class JpgImageFactory extends ImageFactory {
    public Image createImage() {
        System.out.println("创建JPG图片操作器");
        return new JpgImage();
    }
}
