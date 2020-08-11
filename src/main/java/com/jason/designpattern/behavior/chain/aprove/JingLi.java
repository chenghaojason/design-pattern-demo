package com.jason.designpattern.behavior.chain.aprove;

/**
 * @author ChenHol.Wong
 * @create 2020/8/11 22:24
 */
public class JingLi extends ApproveHandler {
    public JingLi(String approveName) {
        super(approveName);
    }

    @Override
    public int process(BusinessApply apply) {
        if (compliance) {
            System.out.println("经理审批通过，请大领导BOSS审批...");
            this.handler.process(apply);
        } else {
            System.out.println("经理审批不通过，请重新修改申请");
        }
        apply.setProgressSpeed(3);
        return 3;
    }
}
