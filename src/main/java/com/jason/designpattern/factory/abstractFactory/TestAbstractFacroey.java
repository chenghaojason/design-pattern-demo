package com.jason.designpattern.factory.abstractFactory;

import com.jason.commons.exception.NewInstanceException;
import com.jason.commons.utils.ParesXML;
import com.jason.designpattern.factory.abstractFactory.dy.interfaces.AbstractFactory;
import com.jason.designpattern.factory.abstractFactory.dy.interfaces.AirConditioner;
import com.jason.designpattern.factory.abstractFactory.dy.interfaces.Television;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:38
 */
public class TestAbstractFacroey {
    public static void main(String[] args) throws NewInstanceException {
        AbstractFactory factory;
        Television television;
        AirConditioner airConditioner;

        factory = (AbstractFactory) ParesXML.getBean("com.jason.designpattern.factory.abstractFactory.dy.classes.", new File("src/main/resources/factory/abstract-factory.xml"));
        television=factory.createTelevision();
        television.play();

        airConditioner=factory.createAirConditioner();
        airConditioner.inUse();
    }
}
