package com.jason.designpattern.behavior.chain.dy;

/**
 * 请假条
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 21:24
 */
public class LeaveRequest {

    private String leaveUserName; // 请假人姓名

    private int days; // 请假天数

    public LeaveRequest() {
    }

    public LeaveRequest(String leaveUserName, int days) {
        this.leaveUserName = leaveUserName;
        this.days = days;
    }

    public String getLeaveUserName() {
        return leaveUserName;
    }

    public void setLeaveUserName(String leaveUserName) {
        this.leaveUserName = leaveUserName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
