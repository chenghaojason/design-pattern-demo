package com.jason.designpattern.structural.adapter;

import com.jason.commons.exception.NewInstanceException;
import com.jason.commons.utils.ParesXML;
import com.jason.designpattern.structural.adapter.defaultadapter.ServiceClass;
import com.jason.designpattern.structural.adapter.dy.ClassAdapter;
import com.jason.designpattern.structural.adapter.dy.ObjectAdaptee;
import com.jason.designpattern.structural.adapter.dy.ObjectAdapter;
import com.jason.designpattern.structural.adapter.encrypt.DataOperator;
import com.jason.designpattern.structural.adapter.power.Transformer;
import com.jason.designpattern.structural.adapter.twoway.AdapteeImpl;
import com.jason.designpattern.structural.adapter.twoway.Adapter;
import com.jason.designpattern.structural.adapter.twoway.TargetImpl;

import java.io.File;

/**
 * @author ChenHol.Wong
 * @create 2020/2/4 17:06
 */
public class AdapterPatternTest {
    public static void main(String[] args) throws NewInstanceException {
        // 基本定义测试
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.request();
        ObjectAdapter objectAdapter = new ObjectAdapter(new ObjectAdaptee());
        objectAdapter.request();

        //电源适配器
        Transformer transformer = (Transformer) ParesXML.getBean(ParesXML.POWER_PACKAGE, new File("src/main/resources/adapter/adapter-pattern-power.xml"));
        System.out.println(transformer.input());
        System.out.println(transformer.output());

        // 加密
        DataOperator dataOperator = (DataOperator) ParesXML.getEncryptBean(ParesXML.ENCRYPT_PACKAGE, new File("src/main/resources/adapter/adapter-pattern-encrypt.xml"));
        dataOperator.setPassword("jason789");
//        dataOperator.setPassword("");
        String encrypt = dataOperator.encrypt(10, dataOperator.getPassword());
        System.out.println("加密结果：" + encrypt);

        // 缺省适配器
        ServiceClass serviceClass = new ServiceClass();
        serviceClass.start();
        serviceClass.stop();

        // 双向适配器
        Adapter adapter = new Adapter();
        adapter.setAdaptee(new AdapteeImpl());
        adapter.setTarget(new TargetImpl());
        adapter.request();
        adapter.response();

    }
}
