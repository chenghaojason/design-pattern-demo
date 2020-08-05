package com.jason.designpattern.structural.Decorator;

import com.jason.designpattern.structural.Decorator.dy.Car;
import com.jason.designpattern.structural.Decorator.dy.Robot;
import com.jason.designpattern.structural.Decorator.dy.TransForm;
import com.jason.designpattern.structural.Decorator.encrption.ComplexCipher;
import com.jason.designpattern.structural.Decorator.encrption.SeniorCipher;
import com.jason.designpattern.structural.Decorator.encrption.SimpleCipher;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author ChenHol.Wong
 * @create 2020/8/4 22:49
 */
public class DecoratoeTest {
    public static void main(String[] args) throws Exception {
        // 基础定义测试
        TransForm car = new Car();
        car.move();
        System.out.println("----------------------");
        Robot robot = new Robot(car);
        robot.move();
        robot.say();

        // 多重加密测试
        String password = "abcdefgxyz"; // 明文
        String cpassword; // 密文
        SimpleCipher simpleCipher = new SimpleCipher();
        cpassword = simpleCipher.encrypt(password);
        System.out.println("简单加密后的密文：" + cpassword); // 只有一层加密

        ComplexCipher complexCipher = new ComplexCipher(simpleCipher);
        cpassword = complexCipher.encrypt(password);
        System.out.println("复杂加密后的密文：" + cpassword); // 经过两层加密

        SeniorCipher seniorCipher = new SeniorCipher(complexCipher);
        cpassword = seniorCipher.encrypt(password);
        System.out.println("高级加密后的密文：" + cpassword); // 经过三层加密处理

        // 对IO流装饰模式的应用
        FileInputStream fileInputStream = new FileInputStream("D:\\test\\lalala.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[1024];
        int read = bufferedInputStream.read(bytes);
        System.out.println(read);

    }
}
