package com.jason.designpattern.structural.flyweight.dy;

/**
 * 集线器-具体享元类
 *
 * @author ChenHol.Wong
 * @create 2020/8/7 20:28
 */
public class Hub implements NetWorkDevice {
    private String type; // 内部状态：集线器型，

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("通过 集线器 链接，集线器型号：" + type + "  IP：" + port.getIp() + "  端口号：" + port.getPort());
    }
}
