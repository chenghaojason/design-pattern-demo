package com.jason.designpattern.factory.abstractFactory.dy.classes;

import com.jason.designpattern.factory.abstractFactory.dy.interfaces.Television;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:31
 */
public class TCLTelevision implements Television {
    @Override
    public void play() {
        System.out.println("TCL电视");
    }
}
