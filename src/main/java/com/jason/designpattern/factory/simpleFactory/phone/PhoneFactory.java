package com.jason.designpattern.factory.simpleFactory.phone;

/**
 * 手机工厂
 *
 * @author ChenHol.Wong
 * @create 2019/12/12 - 22:22
 */
public class PhoneFactory {

    public static Phone createPhone(String brandName) throws Exception {
        if (null == brandName || "".equals(brandName)) {
            throw new Exception("生产手机失败");
        }
        if ("apple".equalsIgnoreCase(brandName)) {
            return new ApplePhone();
        } else if ("huawei".equalsIgnoreCase(brandName)) {
            return new HuaWeiPhone();
        } else if ("meizu".equalsIgnoreCase(brandName)) {
            return new MeiZuPhone();
        } else {
            throw new Exception("生产手机失败，不生产此品牌");
        }
    }
}
