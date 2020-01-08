package com.jason.designpattern.builder.computer;

/**
 * 抽象电脑建造者
 *
 * @author ChenHol.Wong
 * @create 2020/1/8 - 22:08
 */
public abstract class ComputerAbstractBuilder {
    protected Computer computer = new Computer();

    /**
     * 给电脑设置品牌
     */
    abstract void buildBrand();

    /**
     * 组装cpu
     */
    abstract void buildCpu();

    /**
     * 组装多个cpu
     */
    abstract void buildCpuNum();

    /**
     * 组装显卡GPU
     */
    abstract void buildGpu();

    /**
     * 组装内存
     */
    abstract void buildRam();

    /**
     * 组装主板
     */
    abstract void buildMainBoard();

    /**
     * 组装电池
     */
    abstract void buildBattery();

    /**
     * 组装显示器
     */
    abstract void buildMonitor();

    /**
     * 获取成型的电脑
     *
     * @return 电脑
     */
    public Computer getComputer() {
        return computer;
    }
}
