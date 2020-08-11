package com.jason.designpattern.behavior.chain.dy;

/**
 * 经理-具体处理者
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 21:30
 */
public class Manager extends Leader {
    public Manager(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() < 10) {
            System.out.println("经理：" + super.leaderName + "  审批了（" + request.getLeaveUserName() + ")的请假，请假天数：" + request.getDays() + "\r\n");
        } else {
            if (this.succdeeor != null) {
                System.out.println("经理无权审批" + request.getDays() + "天的请假，请总经理审批...");
                this.succdeeor.handleRequest(request);
            }
        }
    }
}
