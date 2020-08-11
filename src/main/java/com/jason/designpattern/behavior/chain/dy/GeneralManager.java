package com.jason.designpattern.behavior.chain.dy;

/**
 * 总经理-具体处理者
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 21:35
 */
public class GeneralManager extends Leader {
    public GeneralManager(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() < 30) {
            System.out.println("总经理：" + leaderName + "  审批了（" + request.getLeaveUserName() + ")的请假，请假天数：" + request.getDays() + "\r\n");
        } else {
            System.out.println("请假天数超过公司规定范围，坚决不给请假！！");
        }
    }
}
