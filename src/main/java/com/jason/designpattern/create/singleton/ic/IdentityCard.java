package com.jason.designpattern.create.singleton.ic;

/**
 * 制作身份证
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 15:52
 */
public class IdentityCard {
    private static IdentityCard identityCard = null;
    private String icNo;// 身份证号码

    public static IdentityCard getIdentityCard() {
        if (identityCard == null) {
            System.out.println("第一次办理身份证，分配新号码");
            identityCard = new IdentityCard();
            identityCard.setIcNo("NO123456");
        } else {
            System.out.println("已办理过身份证，使用旧号码:" + identityCard.getIcNo());
        }
        return identityCard;
    }

    public String getIcNo() {
        return icNo;
    }

    private void setIcNo(String icNo) {
        this.icNo = icNo;
    }
}
