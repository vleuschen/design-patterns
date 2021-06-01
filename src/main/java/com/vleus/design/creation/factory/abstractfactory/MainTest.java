package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:33
 */
public class MainTest {

    public static void main(String[] args) {

        WulinkFacory factory = new WulingHangZhouMaskFactory();
        factory.newMask().protectMe();

        factory = new WulingWuHanMask();
        factory.newMask().protectMe();

        factory = new WulingRacingCarFactory();
        factory.newCar().run();

        factory = new WulingVanCarFactory();
        factory.newCar().run();

    }
}