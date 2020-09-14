package com.jason.designpattern.behavior.strategy;

import com.jason.commons.exception.NewInstanceException;
import com.jason.commons.utils.ParesXML;
import com.jason.designpattern.behavior.strategy.array.ArrayHandler;
import com.jason.designpattern.behavior.strategy.array.Sort;
import com.jason.designpattern.behavior.strategy.dy.ConcreteStrategyA;
import com.jason.designpattern.behavior.strategy.dy.Context;
import com.jason.designpattern.behavior.strategy.job.MetroToWork;
import com.jason.designpattern.behavior.strategy.job.Person;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2020/8/15 16:53
 */
public class TestStrategy {
    public static void main(String[] args) throws NewInstanceException {
        // 测试基本定义
        Context context = new Context();
        context.setAbstractStrategy(new ConcreteStrategyA());
        context.algorithm();
        // 数组排序选择
        int[] arr = new int[]{4, 0, 9, 2, 1, 5, 3, 8, 6, 3, 7};
        ArrayHandler arrayHandler = new ArrayHandler();
        Sort bean = (Sort) ParesXML.getBean(ParesXML.ARRAY_PACKAGE, new File("src/main/resources/strategy/strategy-pattern-array.xml"));
        arrayHandler.setSort(bean); // 设置使用哪种具体策略

        int[] sort = arrayHandler.sort(arr);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

        // 测试上班出行方式
        Person person = new Person();
        person.setToWorkStrategy(new MetroToWork());
        person.toWork();
    }
}
