package com.jason.designpattern.create.singleton;

import com.jason.designpattern.create.singleton.dy.SingletonPattern;
import com.jason.designpattern.create.singleton.dy.SingletonPatternCheck;
import com.jason.designpattern.create.singleton.dy.SingletonPatternDoubleCheck;
import com.jason.designpattern.create.singleton.dy.SingletonPatternHungry;
import com.jason.designpattern.create.singleton.ic.IdentityCard;

/**
 * @author ChenHol.Wong
 * @create 2020/1/31 15:17
 */
public class SingletonPatternTest {
    public static void main(String[] args) {
        // 饿汉模式
        SingletonPatternHungry hungry1 = SingletonPatternHungry.getInstance();
        SingletonPatternHungry hungry2 = SingletonPatternHungry.getInstance();
        System.out.println(hungry1 == hungry2);
        // 懒汉模式 非线程安全
        SingletonPattern instance1 = SingletonPattern.getInstance();
        SingletonPattern instance2 = SingletonPattern.getInstance();
        System.out.println(instance1 == instance2);
        // 懒汉模式 加锁，线程安全
        SingletonPatternCheck check1 = SingletonPatternCheck.getInstance();
        SingletonPatternCheck check2 = SingletonPatternCheck.getInstance();
        System.out.println(check1 == check2);
        // 懒汉模式，双重检查锁定
        SingletonPatternDoubleCheck doubleCheck1 = SingletonPatternDoubleCheck.getInstance();
        SingletonPatternDoubleCheck doubleCheck2 = SingletonPatternDoubleCheck.getInstance();
        System.out.println(doubleCheck1 == doubleCheck2);

        // 单例模式之办理身份证
        IdentityCard card1 = IdentityCard.getIdentityCard();
        IdentityCard card2 = IdentityCard.getIdentityCard();
        System.out.println("身份证是否一致" + (card1 == card2));
        String icNo1 = card1.getIcNo();
        String icNo2 = card2.getIcNo();
        System.out.println("第一次身份证号码：" + icNo1);
        System.out.println("第二次身份证号码：" + icNo2);
        System.out.println("两次号码是否相同：" + (icNo1 == icNo2));

    }
}
