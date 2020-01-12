package com.jason.designpattern.create.builder.computer;

/**
 * 苹果电脑组装者
 *
 * @author ChenHol.Wong
 * @create 2020/1/8 - 22:20
 */
public class AppleComputerBuilder extends ComputerAbstractBuilder {
    @Override
    void buildBrand() {
        computer.setBrand("MacBook Pro ");
    }

    @Override
    void buildCpu() {
        computer.setCpu("英特尔处理器 Core i7 ");
    }

    @Override
    void buildCpuNum() {
        computer.setCpuNum(8);
    }

    @Override
    void buildGpu() {
        computer.setGpu("Intel Iris Plus Graphics 655");
    }

    @Override
    void buildRam() {
        computer.setRam("LPDDR3（低功耗版）2133MHz");
    }

    @Override
    void buildMainBoard() {
        computer.setMainBoard("三星");
    }

    @Override
    void buildBattery() {
        computer.setBattery("锂聚合物电池");
    }

    @Override
    void buildMonitor() {
        computer.setMonitor("13英寸");
    }
}
