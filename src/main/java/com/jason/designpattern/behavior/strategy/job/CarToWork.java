package com.jason.designpattern.behavior.strategy.job;

/**
 * 开车去上班
 *
 * @author ChenHol.Wong
 * @create 2020/9/14 21:37
 */
public class CarToWork implements WayToWorkStrategy {
    @Override
    public void theWay() {
        System.out.println("开车去上班");
    }
}
