package com.jason.designpattern.create.prototype.email;

/**
 * 邮件
 * <br/>
 * 浅克隆邮件类
 * <br/>
 * 使用克隆方法必须实现Cloneable接口，重写clone()方法，并将clone()方法置为public修饰的。
 * 使用clone()方法得到的克隆对象与原对象的引用不同，但是在浅克隆中，克隆对象（邮件）中的成员引用（附件的引用）是同一个。
 *
 * @author ChenHol.Wong
 * @create 2020/1/12 20:29
 */
public class EmailShallow implements Cloneable {

    private Attachments attachments = null; // 邮件附件

    private String type; // 邮件类型
    private int level; // 邮件等级

    public EmailShallow(String type ,int level) {
        this.attachments = new Attachments();
        this.type = type;
        this.level=level;
    }

    /**
     * 获取附件
     *
     * @return 附件对象
     */
    public Attachments getAttachments() {
        return this.attachments;
    }

    public String getType() {
        return type;
    }
    public int getLevel() {
        return level;
    }
    @Override
    public EmailShallow clone() throws CloneNotSupportedException {
        return (EmailShallow) super.clone();
    }

    public void diaplay() {
        System.out.println("查看邮件");
    }
}
