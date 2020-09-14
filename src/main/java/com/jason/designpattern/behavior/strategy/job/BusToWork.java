package com.jason.designpattern.behavior.strategy.job;

/**
 * 坐公交车去上班
 *
 * @author ChenHol.Wong
 * @create 2020/9/14 21:38
 */
public class BusToWork implements WayToWorkStrategy {
    @Override
    public void theWay() {
        System.out.println("坐公交车去上班");
    }
}
