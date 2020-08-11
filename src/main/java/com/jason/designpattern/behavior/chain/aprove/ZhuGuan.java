package com.jason.designpattern.behavior.chain.aprove;

/**
 * 主管
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 22:23
 */
public class ZhuGuan extends ApproveHandler {
    public ZhuGuan(String approveName) {
        super(approveName);
    }

    @Override
    public int process(BusinessApply apply) {
        if (compliance) {
            System.out.println("主管审批通过，请经理审批...");
            this.handler.process(apply);
        } else {
            System.out.println("主管审批不通过，请重新修改申请");
        }
        apply.setProgressSpeed(2);
        return 2;
    }
}
