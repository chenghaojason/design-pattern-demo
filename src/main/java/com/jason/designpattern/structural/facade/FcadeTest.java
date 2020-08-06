package com.jason.designpattern.structural.facade;

import com.jason.designpattern.structural.facade.abstractfacade.ConcreteFacade1;
import com.jason.designpattern.structural.facade.abstractfacade.ConcreteFacade2;
import com.jason.designpattern.structural.facade.abstractfacade.ConcreteFacade3;
import com.jason.designpattern.structural.facade.dy.MasterSwitchFacade;

/**
 * @author ChenHol.Wong
 * @create 2020/8/6 21:34
 */
public class FcadeTest {
    public static void main(String[] args) {
        // 基本定义，总开关的测试
        MasterSwitchFacade facade = new MasterSwitchFacade();
        facade.on();
        facade.off();

        // 测试抽象外观类
        new ConcreteFacade1().execute();
        new ConcreteFacade2().execute();
        new ConcreteFacade3().execute();

    }
}
