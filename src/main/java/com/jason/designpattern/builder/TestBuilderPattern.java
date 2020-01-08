package com.jason.designpattern.builder;

import com.jason.commons.exception.NewInstanceException;
import com.jason.commons.utils.ParesXML;
import com.jason.designpattern.builder.computer.Computer;
import com.jason.designpattern.builder.computer.ComputerAbstractBuilder;
import com.jason.designpattern.builder.computer.Salesperson;
import com.jason.designpattern.builder.dy.*;
import com.jason.designpattern.builder.kfc.KFCWaiter;
import com.jason.designpattern.builder.kfc.Meal;
import com.jason.designpattern.builder.kfc.MealBuilder;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:18
 */
public class TestBuilderPattern {
    public static void main(String[] args) throws NewInstanceException {
        // 示例

//        Builder builder = new BuilderOne();
        Builder builder = new BuilderTwo();
        Director director = new Director(builder);
        Product construct = director.construct();

        System.out.println(construct.getClass());

        // KFC
        MealBuilder mealBuilder = (MealBuilder) ParesXML.getBean(ParesXML.BU_KFC_PACKAGE, new File("src/main/resources/builder/builder-pattern-kfc.xml"));
        KFCWaiter kfcWaiter = new KFCWaiter();
        kfcWaiter.setBuilder(mealBuilder);
        Meal meal = kfcWaiter.construct();
        System.out.println(meal.toString());

        // 电脑销售员
        ComputerAbstractBuilder computerAbstractBuilder = (ComputerAbstractBuilder) ParesXML.getBean(ParesXML.BU_COMPUTER_PACKAGE, new File("src/main/resources/builder/builder-pattern-computer.xml"));
        Salesperson salesperson = new Salesperson(computerAbstractBuilder);
        Computer computer = salesperson.choose();
        System.out.println(computer.toString());
    }
}
