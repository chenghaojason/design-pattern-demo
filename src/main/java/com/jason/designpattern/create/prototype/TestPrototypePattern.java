package com.jason.designpattern.create.prototype;

import com.jason.designpattern.create.prototype.color.Color;
import com.jason.designpattern.create.prototype.color.ColorPrototypeManager;
import com.jason.designpattern.create.prototype.dy.PrototypeDemo;
import com.jason.designpattern.create.prototype.email.EmailDeep;
import com.jason.designpattern.create.prototype.email.EmailShallow;

/**
 * 原型模式测试类
 * <br/>
 * 使用原型模式得到的克隆对象和原型对象引用不一致，也就是这两个对象在内存中是两个完全不同的对象。
 */
public class TestPrototypePattern {
    public static void main(String[] args) throws Exception {

        PrototypeDemo demo = new PrototypeDemo();
        PrototypeDemo clone = (PrototypeDemo) demo.clone();

        System.out.println("demo==clone?" + (demo == clone));

        // 邮件   浅克隆
        System.out.println("===== 浅克隆 =====");
        EmailShallow emailShallow, copyEmailShallow;
        emailShallow = new EmailShallow("qq邮件",1);
        copyEmailShallow = emailShallow.clone(); // 浅克隆
        // 通过以下的输出结果可以看到，附件对象是相同的，也就是浅克隆并没有重新复制一份新的附件对象，引用的还是原对象中的引用。
        // 原型对象和克隆对象维持了对相同的成员对象的引用。
        System.out.println("emailShallow == copyEmailShallow ？" + (emailShallow == copyEmailShallow));
        System.out.println("附件对象是否相同？" + (emailShallow.getAttachments() == copyEmailShallow.getAttachments()));
        System.out.println("邮件类型是否相同？" + (emailShallow.getType() == copyEmailShallow.getType()));
        System.out.println("邮件等级是否相同？" + (emailShallow.getLevel() == copyEmailShallow.getLevel()));

        // 邮件   深克隆
        System.out.println("===== 深克隆 =====");
        EmailDeep emailDeep, copyEmailDeep;
        emailDeep = new EmailDeep("网易163邮件",3);
        copyEmailDeep = (EmailDeep) emailDeep.deepClone();

        System.out.println("emailDeep == copyEmailDeep ？" + (emailDeep == copyEmailDeep));
        System.out.println("附件对象是否相同？" + (emailDeep.getAttachments() == copyEmailDeep.getAttachments()));
        System.out.println("邮件类型是否相同？" + (emailDeep.getType() == copyEmailDeep.getType()));
        System.out.println("邮件等级是否相同？" + (emailDeep.getLevel() == copyEmailDeep.getLevel()));

        // 颜色原型管理器
        ColorPrototypeManager manager = new ColorPrototypeManager();
        Color red1 = manager.getColor("red");
        red1.display();
        Color red2 = manager.getColor("red");
        red2.display();
        System.out.println("通过原型管理器获得的red1和red2是否相同？" + (red1 == red2));

    }
}
