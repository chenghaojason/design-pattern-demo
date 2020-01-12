package com.jason.designpattern.create.factory.factoryMethod;

import com.jason.designpattern.create.factory.factoryMethod.image.Image;
import com.jason.designpattern.create.factory.factoryMethod.image.ImageFactory;
import com.jason.designpattern.create.factory.factoryMethod.tv.TV;
import com.jason.designpattern.create.factory.factoryMethod.tv.TVFactory;
import com.jason.commons.utils.ParesXML;
import com.jason.designpattern.create.factory.factoryMethod.dy.AbstractFactory;
import com.jason.designpattern.create.factory.factoryMethod.dy.AbstractProduct;
import com.jason.designpattern.create.factory.factoryMethod.dy.BigProductFactory;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2019/12/23 - 21:54
 */
public class TestFactoryMethod {
    public static void main(String[] args) throws Exception {
        // 抽象定义对象
        AbstractFactory factory;
        AbstractProduct product;

        // 方式一
        factory = new BigProductFactory();
        product = factory.createProductFactory();
        product.createProduct();

        // 方式二（推荐，更符合开闭原则）
        factory = (AbstractFactory) ParesXML.getBean(ParesXML.DY_PACKAGE, new File("src/main/resources/factory/factory-method.xml"));
        product = factory.createProductFactory();
        product.createProduct();

        // 电视工厂
        TVFactory tvFactory;
        TV tv;
        tvFactory = (TVFactory) ParesXML.getBean(ParesXML.TV_PACKAGE, new File("src/main/resources/factory/tv.xml"));
        tv = tvFactory.createTV();
        tv.play();

        // 图片工厂
        ImageFactory imageFactory;
        Image image;
        imageFactory = (ImageFactory) ParesXML.getImageBean(ParesXML.IMAGE_PACKAGE, new File("src/main/resources/factory/image.xml"));
        image = imageFactory.createImage();
        image.reader();


    }
}
