package com.vleus.design.creation.factory.factorymethod;


/**
 * @author vleus
 * @date 2021年05月31日 22:10
 */
public class MiniCar extends AbstractCar {

    public MiniCar() {
        this.engine = "四缸水平对峙发动机";
    }

    @Override
    public void run() {
        System.out.println(engine + "---->嘟嘟嘟");
    }
}