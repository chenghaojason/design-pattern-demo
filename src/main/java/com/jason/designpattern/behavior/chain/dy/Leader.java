package com.jason.designpattern.behavior.chain.dy;

/**
 * 领导者类-抽象处理者
 *
 * @author ChenHol.Wong
 * @create 2020/8/11 21:27
 */
public abstract class Leader {
    protected String leaderName; // 领导人名字
    protected Leader succdeeor;// 处理人

    public Leader(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setSuccdeeor(Leader succdeeor) {
        this.succdeeor = succdeeor;
    }

    public abstract void handleRequest(LeaveRequest request);
}
