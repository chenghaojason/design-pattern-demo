package com.jason.designpattern.structural.Composite.warehouse;

import java.util.ArrayList;

/**
 * @author ChenHol.Wong
 * @create 2020/2/8 19:49
 */
public class Box extends Things {

    private ArrayList<Things> list = new ArrayList();

    public Box(String name) {
        super(name);
    }

    @Override
    public void use() {
        for (Things thing : list) {
            thing.use();
        }
    }

    public void remove(Things thing) {
        list.remove(thing);
    }

    public void add(Things... thing) {
        int length = thing.length;
        for (int i = 0; i < length; i++) {
            list.add(thing[i]);
        }
    }
}
