package com.jason.commons.beans.db;

/**
 * 数据库对象
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 22:29
 */
public class DataBase {
    private String dataBaseName;//数据库名称
    private String ip; //IP
    private String port;// 端口
    private String userName;// 用户名
    private String password;// 密码

    @Override
    public String toString() {
        return "DateBase{" +
                "dataBaseName='" + dataBaseName + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
