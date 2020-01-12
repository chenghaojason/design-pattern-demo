package com.jason.designpattern.create.factory.simpleFactory.right;

/**
 * @author ChenHol.Wong
 * @create 2019/12/15 - 20:45
 */
public class UserFactory {

    public static User createUser(int level) throws Exception {
        if (level == 0) {
            return new Administrntor();
        } else if (level == 1) {
            return new Manager();
        } else if (level == 2) {
            return new Employee();
        } else {
            throw new Exception("创建用户失败");
        }
    }
}
