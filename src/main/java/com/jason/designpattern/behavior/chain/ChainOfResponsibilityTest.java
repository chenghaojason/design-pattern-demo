package com.jason.designpattern.behavior.chain;

import com.jason.designpattern.behavior.chain.aprove.*;
import com.jason.designpattern.behavior.chain.dy.Director;
import com.jason.designpattern.behavior.chain.dy.GeneralManager;
import com.jason.designpattern.behavior.chain.dy.LeaveRequest;
import com.jason.designpattern.behavior.chain.dy.Manager;

import java.util.Date;

/**
 * @author ChenHol.Wong
 * @create 2020/8/11 21:36
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        // 测试请假条审批
        GeneralManager generalManager = new GeneralManager("张三");
        Manager manager = new Manager("李四");
        Director director = new Director("王五");

        director.setSuccdeeor(manager);
        manager.setSuccdeeor(generalManager);

        director.handleRequest(new LeaveRequest("员工1", 1));
        director.handleRequest(new LeaveRequest("员工2", 3));
        director.handleRequest(new LeaveRequest("员工3", 5));
        director.handleRequest(new LeaveRequest("员工4", 18));
        director.handleRequest(new LeaveRequest("员工5", 40));

        // 审批流
        System.out.println("--------------------------\r\n");
        Boss boss = new Boss("A");
        JingLi jingLi = new JingLi("B");
        ZhuGuan zhuGuan = new ZhuGuan("C");
        Group group = new Group("D");

        group.setHandler(zhuGuan).setCompliance(true);
        zhuGuan.setHandler(jingLi).setCompliance(true);
        jingLi.setHandler(boss).setCompliance(false);

        group.process(new BusinessApply("上市计划书", "tom", new Date(), 0));


    }
}
