package com.jason.designpattern.structural.Decorator.encrption;

/**
 * 高级加密类
 *
 * @author ChenHol.Wong
 * @create 2020/8/5 21:03
 */
public class SeniorCipher extends CipherDecorator {
    public SeniorCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String anyThing) {
        String encrypt = super.encrypt(anyThing);
        return mod(encrypt);
    }

    /**
     * 求模加密
     */
    public String mod(String text) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            str += String.valueOf(text.charAt(i) % 6);
        }
        return str;
    }
}
