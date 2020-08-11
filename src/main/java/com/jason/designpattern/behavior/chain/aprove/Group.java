package com.jason.designpattern.behavior.chain.aprove;

/**
 * @author ChenHol.Wong
 * @create 2020/8/11 22:10
 */
public class Group extends ApproveHandler {
    public Group(String approveName) {
        super(approveName);
    }

    @Override
    public int process(BusinessApply apply) {
        if (compliance) {
            System.out.println("组长审批通过，请主管审批...");
            this.handler.process(apply);
        } else {
            System.out.println("组长审批不通过，请重新修改申请");
        }
        apply.setProgressSpeed(1);
        return 1;
    }
}
