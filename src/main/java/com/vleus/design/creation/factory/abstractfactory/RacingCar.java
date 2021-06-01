package com.vleus.design.creation.factory.abstractfactory;


/**
 * @author vleus
 * @date 2021年05月31日 22:24
 */
public class RacingCar extends AbstractCar {

    public RacingCar() {
        this.engine = "v9发动机";
    }

    @Override
    public void run() {
        System.out.println(engine + "嗖一下。。。");
    }
}