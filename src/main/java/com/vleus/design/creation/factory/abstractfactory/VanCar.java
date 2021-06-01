package com.vleus.design.creation.factory.abstractfactory;



/**
 * @author vleus
 * @date 2021年05月31日 22:09
 */
public class VanCar extends AbstractCar {

    VanCar() {
        this.engine = "单缸柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + "---> 哒哒哒。。。");
    }
}