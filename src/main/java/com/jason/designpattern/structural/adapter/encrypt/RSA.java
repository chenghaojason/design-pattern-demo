package com.jason.designpattern.structural.adapter.encrypt;

/**
 * 对象适配器
 * 适配者-RSA加密
 *
 * @author ChenHol.Wong
 * @create 2020/2/6 10:35
 */
public final class RSA {
    /**
     * 加密过程随便写的
     *
     * @param key 密钥
     * @param ps  密码
     * @return 加密后的结果
     */
    public String encryptRSA(int key, String ps) {
        if (ps == null || "".equals(ps)) {
            throw new NullPointerException("密码为空");
        }
        String rs = "";
        char[] chars = ps.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c > 'a' && c < 'z') {
                c += key % 26;
                rs += c;
            }
            if (c > 'A' && c < 'Z') {
                c += key % 26;
                rs += c;
            }
            if (c >= 0 && c < 9) {
                rs += (c + 1);
            }
            if (c == 9) {
                rs += '%';
            }
        }
        return rs;
    }
}
