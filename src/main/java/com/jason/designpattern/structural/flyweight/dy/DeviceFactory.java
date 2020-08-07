package com.jason.designpattern.structural.flyweight.dy;

import java.util.HashMap;
import java.util.Map;

/**
 * 网络设备工厂类——享元工厂类
 *
 * @author ChenHol.Wong
 * @create 2020/8/7 20:29
 */
public class DeviceFactory {

    private Map<String, NetWorkDevice> devices = new HashMap<>(); // 享元池，用于存放所有的享元对象，也就是网络设备

    private int totalTerminal = 0; // 设备终端总数

    public DeviceFactory() {
        devices.put("huawei", new Switch("S5720S-28P-LI-AC"));
        devices.put("yyz", new Hub("Y-3197"));
    }

    public NetWorkDevice getNetWorkDevice(String type) {
        if (devices.containsKey(type)) {
            totalTerminal++;
            return devices.get(type);
        } else {
            return null;
        }
    }

    /**
     * 获取享元池中的数量
     */
    public int getTotalDevice() {
        return devices.size();
    }

    /**
     * 获取使用的终端数量
     */
    public int getTotalTerminal() {
        return totalTerminal;
    }


}
