package com.jason.designpattern.structural.Composite;

import com.jason.designpattern.structural.Composite.dy.Component;
import com.jason.designpattern.structural.Composite.dy.Composite;
import com.jason.designpattern.structural.Composite.dy.Leaf;
import com.jason.designpattern.structural.Composite.file.*;
import com.jason.designpattern.structural.Composite.warehouse.*;

/**
 * 组合模式测试类
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 15:25
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        // 基础
        Component leaf, composite;
        leaf = new Leaf();
        composite = new Composite();

        leaf.add(composite);
        leaf.operation();
        composite.add(leaf);
        composite.add(leaf);
        composite.operation();
        // 物品
        Things phone, medicinal, book;
        Box box1, box2, box3, box;

        box1 = new Box("纸盒子");
        phone = new Phone("华为");
        box1.add(phone);
        box1.add(phone);

        box2 = new Box("塑料盒子");
        book = new Book("语文书");
        box2.add(book);

        box3 = new Box("精美包装盒");
        medicinal = new Medicinal("口罩");
        box3.add(medicinal);

        box = new Box("货箱");
        box.add(box1, box2, box3);

        box.use();
        // 文件
        System.out.println("============ 文件 ============");
        AbstractFile bigFolder, middleFolder, smallFolder, video1, video2, image, text1, text2, text3;
        bigFolder = new Folder("测试组合模式", "D://测试组合模式");
        text1 = new TextFile("a", "记事本", 12);
        bigFolder.add(text1);

        middleFolder = new Folder("第二层文件夹", "D://测试组合模式/第二层文件夹");
        text2 = new TextFile("b", "记事本", 12);
        video1 = new VideoFile("庆余年", "视频", 320912, "mkv");
        image = new ImageFile("自拍照", "图片", 1024);
        middleFolder.add(text2);
        middleFolder.add(video1);
        middleFolder.add(image);

        smallFolder = new Folder("第三层文件夹", "D://测试组合模式/第二层文件夹/第三层文件夹");
        text3 = new TextFile("c", "记事本", 3);
        video2 = new VideoFile("春节联欢晚会记录", "视频", 2075932, "rmvb");
        smallFolder.add(text3);
        smallFolder.add(video2);

        middleFolder.add(smallFolder);
        bigFolder.add(middleFolder);

        bigFolder.display();
    }
}
