package com.jason.designpattern.structural.Composite.dy;

import com.jason.commons.exception.CompositeOperationException;

/**
 * 叶子构件
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 15:15
 */
public class Leaf extends Component {
    @Override
    public void add(Component component) {
        try {
            throw new CompositeOperationException("叶子构件无法进行添加操作");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
    }

    @Override
    public void remove(Component component) {
        try {
            throw new CompositeOperationException("叶子构件无法进行移除操作");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
    }

    @Override
    public Component getChild(int i) {
        try {
            throw new CompositeOperationException("叶子构件无子构件");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void operation() {
        System.out.println("打开叶子构件");
    }
}
