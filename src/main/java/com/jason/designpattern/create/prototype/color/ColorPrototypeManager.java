package com.jason.designpattern.create.prototype.color;

import java.util.Hashtable;

/**
 * (颜色)原型管理器
 *
 * @author ChenHol.Wong
 * @create 2020/1/27 13:37
 */
public class ColorPrototypeManager {

    private Hashtable<String, Color> hashtable = new Hashtable();

    public ColorPrototypeManager() {
        hashtable.put("red", new Red());
        hashtable.put("green", new Green());
        hashtable.put("yellow", new Yellow());
    }

    public void addColor(String key, Color color) {
        hashtable.put(key, color);
    }

    public Color getColor(String key) {
        return (Color) hashtable.get(key).clone();
    }
}
