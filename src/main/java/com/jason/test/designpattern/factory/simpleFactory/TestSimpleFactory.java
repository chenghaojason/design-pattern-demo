package com.jason.test.designpattern.factory.simpleFactory;

import com.jason.test.commons.utils.ParesXML;
import com.jason.test.designpattern.factory.simpleFactory.example.AbstractGoToWork;
import com.jason.test.designpattern.factory.simpleFactory.example.WalkFactory;
import com.jason.test.designpattern.factory.simpleFactory.phone.Phone;
import com.jason.test.designpattern.factory.simpleFactory.phone.PhoneFactory;
import com.jason.test.designpattern.factory.simpleFactory.right.User;
import com.jason.test.designpattern.factory.simpleFactory.right.UserFactory;

/**
 * 简单工厂模式测试类
 *
 * @author ChenHol.Wong
 * @description 简单工厂模式测试类
 * @create 2019/12/12 - 21:55
 */
public class TestSimpleFactory {

    public static void main(String[] args) throws Exception {
        AbstractGoToWork bus = WalkFactory.createWalk("bus");
        bus.walk();

        String brandName = ParesXML.getBrandName();
        Phone meizu = PhoneFactory.createPhone(brandName);
        meizu.play();

        User user = UserFactory.createUser(0);
        user.updateUserInfo();
        user.visitContent();
    }
}
