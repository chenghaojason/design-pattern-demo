package com.jason.designpattern.behavior.chain.aprove;

/**
 * @author ChenHol.Wong
 * @create 2020/8/11 22:25
 */
public class Boss extends ApproveHandler {
    public Boss(String approveName) {
        super(approveName);
    }

    @Override
    public int process(BusinessApply apply) {
        if (compliance) {
            System.out.println("领导BOSS审批通过，请执行吧");
            this.handler.process(apply);
        } else {
            System.out.println("经领导BOSS审批不通过，请重新修改申请");
        }
        apply.setProgressSpeed(4);
        return 4;
    }
}
