package com.jason.designpattern.behavior.strategy.job;

/**
 * 地铁出行
 *
 * @author ChenHol.Wong
 * @create 2020/9/14 21:39
 */
public class MetroToWork implements WayToWorkStrategy {
    @Override
    public void theWay() {
        System.out.println("坐地铁去上班");
    }
}
