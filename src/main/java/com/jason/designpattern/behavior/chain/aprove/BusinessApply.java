package com.jason.designpattern.behavior.chain.aprove;

import java.util.Date;

/**
 * 某种业务申请
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 22:04
 */
public class BusinessApply {
    private String applyContent; // 业务申请的名称
    private String applyUserName; // 业务申请人
    private Date applyDate; // 业务申请时间
    private int progressSpeed; // 业务审批进展 1：组长，2：主管，3：经理，4：Boss

    public BusinessApply(String applyName, String applyUserName, Date applyDate, int progressSpeed) {
        this.applyContent = applyName;
        this.applyUserName = applyUserName;
        this.applyDate = applyDate;
        this.progressSpeed = progressSpeed;
    }

    public String getApplyContent() {
        return applyContent;
    }

    public void setApplyContent(String applyContent) {
        this.applyContent = applyContent;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public int getProgressSpeed() {
        return progressSpeed;
    }

    public void setProgressSpeed(int progressSpeed) {
        this.progressSpeed = progressSpeed;
    }
}
