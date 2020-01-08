package com.jason.designpattern.builder.computer;

/**
 * 销售员 - 指挥者
 *
 * @author ChenHol.Wong
 * @create 2020/1/8 - 22:32
 */
public class Salesperson {
    private ComputerAbstractBuilder computerAbstractBuilder;

    public Salesperson(ComputerAbstractBuilder computerAbstractBuilder) {
        this.computerAbstractBuilder = computerAbstractBuilder;
    }


    /**
     * 销售员选择电脑
     *
     * @return 电脑
     */
    public Computer choose() {
        computerAbstractBuilder.buildBrand();
        computerAbstractBuilder.buildCpu();
        computerAbstractBuilder.buildCpuNum();
        computerAbstractBuilder.buildGpu();
        computerAbstractBuilder.buildRam();
        computerAbstractBuilder.buildBattery();
        computerAbstractBuilder.buildMainBoard();
        computerAbstractBuilder.buildMonitor();
        return computerAbstractBuilder.getComputer();
    }
}
