package com.jason.designpattern.structural.flyweight.dy;

/**
 * 端口号-外部状态，每个网络设备的IP和端口号不同
 *
 * @author ChenHol.Wong
 * @create 2020/8/7 20:46
 */
public class Port {
    private String port;
    private String ip;

    public Port(String port,String ip) {
        this.port = port;
        this.ip=ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
