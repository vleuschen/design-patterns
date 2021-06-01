package com.vleus.design.creation.factory.factorymethod;

/**
 * @author vleus
 * @date 2021年05月31日 22:33
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractCarFactory carFactory = new WulingRacingFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();

        carFactory = new WulingVanCarFactory();
        AbstractCar vanCar = carFactory.newCar();
        vanCar.run();

    }
}