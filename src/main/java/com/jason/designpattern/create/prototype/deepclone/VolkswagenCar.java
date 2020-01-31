package com.jason.designpattern.create.prototype.deepclone;

import java.io.*;

/**
 * 具体原型类-大众汽车
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 14:40
 */
public class VolkswagenCar extends Car {
    @Override
    public Object clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            System.out.println("深克隆复制大众汽车异常:" + e.getMessage());
        }
        return null;
    }

    @Override
    public void run() {
        System.out.println("大众汽车在启动");
    }
}
