package com.jason.designpattern.create.builder.computer;

/**
 * 产品角色-电脑
 *
 * @author ChenHol.Wong
 * @create 2020/1/8 - 21:57
 */
public class Computer {

    private String cpu;//中央处理器-CPU
    private int cpuNum;//CPU个数
    private String ram;// 内存-RAM
    private String gpu;// 图形处理器-显卡GPU
    private String mainBoard;//主板
    private String battery;//电池
    private String monitor;//显示器
    private String brand;//品牌

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getCpuNum() {
        return cpuNum;
    }

    public void setCpuNum(int cpuNum) {
        this.cpuNum = cpuNum;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "电脑详情：\n" +
                "电脑品牌：" + brand + "\n" +
                "CPU类型：" + cpu + "\n" +
                "CPU个数：" + cpuNum + "\n" +
                "内存条：" + ram + "\n" +
                "显卡：" + gpu + "\n" +
                "主板：" + mainBoard + "\n" +
                "电池：" + battery + "\n" +
                "显示器：" + monitor + "\n";
    }
}
