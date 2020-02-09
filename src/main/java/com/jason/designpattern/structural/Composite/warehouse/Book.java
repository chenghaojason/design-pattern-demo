package com.jason.designpattern.structural.Composite.warehouse;

/**
 * 书籍
 * 叶子构件类
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 20:01
 */
public class Book extends Things {
    public Book(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println(super.getName() + "书可以长知识");
    }


}
