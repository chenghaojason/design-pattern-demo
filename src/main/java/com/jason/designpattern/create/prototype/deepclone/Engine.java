package com.jason.designpattern.create.prototype.deepclone;

import java.io.Serializable;

/**
 * 发动机
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 14:36
 */
public class Engine implements Serializable {
    private String num;// 形状

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void working() {
        System.out.println("发动机在转动........");
    }
}
