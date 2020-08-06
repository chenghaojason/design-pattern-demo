package com.jason.designpattern.structural.facade.abstractfacade;

/**
 * @author ChenHol.Wong
 * @create 2020/8/6 22:07
 */
public class ConcreteFacade2 extends AbstractFacade {
    @Override
    public void execute() {
        new Subsystem3().method();
        new Subsystem4().method();
    }
}
