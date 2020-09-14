package com.jason.designpattern.behavior.strategy.job;

/**
 * 步行上班
 *
 * @author ChenHol.Wong
 * @create 2020/9/14 21:37
 */
public class walkToWork implements WayToWorkStrategy {
    @Override
    public void theWay() {
        System.out.println("步行去上班");
    }
}
