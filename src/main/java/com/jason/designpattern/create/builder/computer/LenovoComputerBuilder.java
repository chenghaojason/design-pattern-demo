package com.jason.designpattern.create.builder.computer;

/**
 * 联想电脑组装者
 *
 * @author ChenHol.Wong
 * @create 2020/1/8 - 22:20
 */
public class LenovoComputerBuilder extends ComputerAbstractBuilder {
    @Override
    void buildBrand() {
        computer.setBrand("联想（Lenovo）");
    }

    @Override
    void buildCpu() {
        computer.setCpu("AMD处理器");
    }

    @Override
    void buildCpuNum() {
        computer.setCpuNum(4);
    }

    @Override
    void buildGpu() {
        computer.setGpu("七彩虹");
    }

    @Override
    void buildRam() {
        computer.setRam("金士顿");
    }

    @Override
    void buildMainBoard() {
        computer.setMainBoard("微星");
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
