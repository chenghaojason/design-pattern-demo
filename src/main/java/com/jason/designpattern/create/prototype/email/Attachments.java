package com.jason.designpattern.create.prototype.email;

import java.io.Serializable;

/**
 * 附件
 *
 * @author ChenHol.Wong
 * @create 2020/1/12 20:24
 */
public class Attachments implements Serializable {

    public void download() {
        System.out.println("下载附件....");
    }
}
