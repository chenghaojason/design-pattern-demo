package com.jason.designpattern.structural.facade.abstractfacade;

/**
 * @author ChenHol.Wong
 * @create 2020/8/6 22:08
 */
public class ConcreteFacade3 extends AbstractFacade {

    @Override
    public void execute() {
        new Subsystem2().method();
        new Subsystem3().method();
    }
}
