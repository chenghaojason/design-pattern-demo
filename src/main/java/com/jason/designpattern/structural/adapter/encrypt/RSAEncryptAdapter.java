package com.jason.designpattern.structural.adapter.encrypt;

/**
 * 对象适配器
 * 适配器-RSA加密适配器
 *
 * @author ChenHol.Wong
 * @create 2020/2/6 10:51
 */
public class RSAEncryptAdapter extends DataOperator {
    private RSA rsa;

    public RSAEncryptAdapter() {
        this.rsa = new RSA();
    }

    @Override
    public String encrypt(int key, String ps) {
        return rsa.encryptRSA(key, ps);
    }
}
