package com.jason.designpattern.structural.facade.abstractfacade;

/**
 * @author ChenHol.Wong
 * @create 2020/8/6 22:04
 */
public class ConcreteFacade1 extends AbstractFacade {

    @Override
    public void execute() {
        new Subsystem1().method();
        new Subsystem2().method();
    }
}
