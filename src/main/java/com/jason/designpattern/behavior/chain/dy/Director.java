package com.jason.designpattern.behavior.chain.dy;

/**
 * 主任-具体处理者
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 21:34
 */
public class Director extends Leader {
    public Director(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() < 3) {
            System.out.println("主任：" + leaderName + "  审批了（" + request.getLeaveUserName() + ")的请假，请假天数：" + request.getDays() + "\r\n");
        } else {
            if (this.succdeeor != null) {
                System.out.println("主任无权审批" + request.getDays() + "天的请假，请经理审批...");
                this.succdeeor.handleRequest(request);
            }
        }
    }
}
