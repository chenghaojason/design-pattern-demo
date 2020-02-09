package com.jason.designpattern.structural.Composite.dy;

import java.util.ArrayList;

/**
 * 容器构件
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 15:22
 */
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component com : list) {
            com.operation();
        }
    }
}
