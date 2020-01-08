package com.jason.designpattern.builder.computer;

/**
 * 三星电脑组装者
 *
 * @author ChenHol.Wong
 * @create 2020/1/8 - 22:20
 */
public class SamsungComputerBuilder extends ComputerAbstractBuilder {
    @Override
    void buildBrand() {
        computer.setBrand("三星（Samsung）");
    }

    @Override
    void buildCpu() {
        computer.setCpu("英特尔处理器 Core i5 ");
    }

    @Override
    void buildCpuNum() {
        computer.setCpuNum(8);
    }

    @Override
    void buildGpu() {
        computer.setGpu("技嘉");
    }

    @Override
    void buildRam() {
        computer.setRam("三星");
    }

    @Override
    void buildMainBoard() {
        computer.setMainBoard("三星");
    }

    @Override
    void buildBattery() {
        computer.setBattery("一般电池");
    }

    @Override
    void buildMonitor() {
        computer.setMonitor("三星");
    }
}
