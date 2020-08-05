package com.jason.designpattern.structural.Decorator.encrption;

/**
 * 简单的抽象加密类
 *
 * @author ChenHol.Wong
 * @create 2020/8/5 20:49
 */
public class SimpleCipher implements Cipher {
    @Override
    public String encrypt(String anyThing) {
        String str = "";
        for (int i = 0; i < anyThing.length(); i++) {
            char c = anyThing.charAt(i);
            if (c >= 'a' && c < 'z') {
                c += 6;
                if (c > 'z') c -= 26;
                if (c < 'a') c += 26;
            }
            if (c >= 'A' && c <= 'Z') {
                c += 26;
                if (c > 'Z') c -= 26;
                if (c < 'A') c += 26;
            }
            str += c;
        }
        return str;
    }
}
