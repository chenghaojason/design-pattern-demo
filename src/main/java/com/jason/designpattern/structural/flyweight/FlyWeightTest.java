package com.jason.designpattern.structural.flyweight;

import com.jason.designpattern.structural.flyweight.dy.DeviceFactory;
import com.jason.designpattern.structural.flyweight.dy.NetWorkDevice;
import com.jason.designpattern.structural.flyweight.dy.Port;

/**
 * @author ChenHol.Wong
 * @create 2020/8/7 20:39
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        DeviceFactory factory = new DeviceFactory();

        NetWorkDevice switch1 = factory.getNetWorkDevice("huawei");
        NetWorkDevice switch2 = factory.getNetWorkDevice("huawei");
        NetWorkDevice hub1 = factory.getNetWorkDevice("yyz");
        NetWorkDevice hub2 = factory.getNetWorkDevice("yyz");
        NetWorkDevice hub3 = factory.getNetWorkDevice("yyz");

        switch1.use(new Port("8080", "172.0.0.1"));
        switch2.use(new Port("8081", "172.0.0.2"));
        hub1.use(new Port("8090", "172.0.0.3"));
        hub2.use(new Port("8091", "172.0.0.4"));
        hub3.use(new Port("8092", "172.0.0.5"));
        System.out.println("享元池中的对象数量：" + factory.getTotalDevice() + "  终端设备总数：" + factory.getTotalTerminal());
    }
}
