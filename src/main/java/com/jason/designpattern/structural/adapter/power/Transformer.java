package com.jason.designpattern.structural.adapter.power;

/**
 * 类适配器
 * 笔记本电脑电源转换器
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 17:30
 */
public interface Transformer {
    /**
     * 输入端
     *
     * @return 输入电压
     */
    String input();

    /**
     * 输出端
     *
     * @return 输出电压
     */
    String output();
}
