package com.jason.designpattern.create.prototype.email;

import java.io.*;

/**
 * 邮件
 * <br/>
 * 深克隆邮件类
 * <br/>
 * 深克隆邮件，当原型对象被克隆时，克隆对象的成员引用对象也被克隆了，
 * 即不但原型对象和克隆对象的引用在内存中不是同一个，而且原型对象的成员对象和克隆对象中的成员对象在内存中的引用也不是同一个。
 * <p>
 * 在java中实现浅克隆只需要覆盖Object类的clone()方法即可，而实现深克隆则需要通过序列化的方式实现，即实现Serializable接口，通过流的输出输入实现。
 * <p/>
 *
 * @author ChenHol.Wong
 * @create 2020/1/12 20:29
 */
public class EmailDeep implements Serializable {

    private Attachments attachments = null; // 邮件附件

    private String type; // 邮件类型
    private int level; // 邮件等级

    public EmailDeep(String type ,int level) {
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

    public Object deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }

    public void diaplay() {
        System.out.println("查看邮件");
    }
}
