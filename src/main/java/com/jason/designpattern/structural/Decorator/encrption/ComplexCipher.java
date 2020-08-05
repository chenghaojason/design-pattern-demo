package com.jason.designpattern.structural.Decorator.encrption;

/**
 * 复杂加密类
 *
 * @author ChenHol.Wong
 * @create 2020/8/5 20:57
 */
public class ComplexCipher extends CipherDecorator {
    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String anyThing) {
        String encrypt = super.encrypt(anyThing);
        return reverse(encrypt);
    }

    /**
     * 逆向输出
     */
    public String reverse(String text) {
        String str = "";
        for (int i = text.length(); i > 0; i--) {
            str += text.substring(i - 1, i);
        }
        return str;
    }
}
