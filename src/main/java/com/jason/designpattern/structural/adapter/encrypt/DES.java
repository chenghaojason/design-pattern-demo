package com.jason.designpattern.structural.adapter.encrypt;

/**
 * 对象适配器
 * 适配器者-DES加密
 *
 * @author ChenHol.Wong
 * @create 2020/2/6 10:47
 */
public final class DES {
    public String encryptDES(int key, String ps) {
        // DES加密处理 省略
        return ps + key;
    }
}
