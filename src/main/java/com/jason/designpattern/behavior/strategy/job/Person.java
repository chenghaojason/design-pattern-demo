package com.jason.designpattern.behavior.strategy.job;

/**个人
 * @author ChenHol.Wong
 * @create 2020/9/14 21:39
 */
public class Person {

    private WayToWorkStrategy toWorkStrategy;

    public void setToWorkStrategy(WayToWorkStrategy toWorkStrategy) {
        this.toWorkStrategy = toWorkStrategy;
    }
    public void toWork(){
        toWorkStrategy.theWay();
    }
}
