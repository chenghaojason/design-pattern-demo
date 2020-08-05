package com.jason.designpattern.structural.Decorator.encrption;

/**
 * 加密装饰类
 *
 * @author ChenHol.Wong
 * @create 2020/8/5 20:54
 */
public class CipherDecorator implements Cipher {
    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String anyThing) {
        return cipher.encrypt(anyThing);
    }
}
