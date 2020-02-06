package com.jason.designpattern.structural.adapter.encrypt;

/**
 * 对象适配器
 * 适配器-DES加密适配器
 *
 * @author ChenHol.Wong
 * @create 2020/2/6 10:53
 */
public class DESEncryptAdapter extends DataOperator {
    private DES des;

    public DESEncryptAdapter() {
        this.des = new DES();
    }

    @Override
    public String encrypt(int key, String ps) {
        return des.encryptDES(key, ps);
    }
}
