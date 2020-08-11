package com.jason.designpattern.behavior.chain.aprove;

/**
 * 业务审批抽象处理者
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 22:07
 */
public abstract class ApproveHandler {

    protected String approveName;//审批者的名字
    protected String rule = ""; // 审批时的规则
    protected boolean compliance; // 是否符合审批规则
    protected ApproveHandler handler; // 处理人

    public ApproveHandler setHandler(ApproveHandler handler) {
        this.handler = handler;
        return this;
    }

    public ApproveHandler(String approveName) {
        this.approveName = approveName;
    }

    public boolean getCompliance() {
        return compliance;
    }

    public ApproveHandler setCompliance(boolean compliance) {
        this.compliance = compliance;
        return this;
    }

    public ApproveHandler(String approveName, String rule) {
        this.approveName = approveName;
        this.rule = rule;
    }

    public abstract int process(BusinessApply apply);

    /**
     * 判断具体需要审批的事件是否符合当前审批人的校验条件
     *
     * @return
     */
    protected boolean Compliance() {
        // 省略具体的校验步骤 ....
        // 直接返回创建时的参数 compliance 值
        return compliance;
    }
}
