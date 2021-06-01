package com.vleus.design.creation.factory.simpleFactory;

/**
 * @author vleus
 * @date 2021年05月31日 22:06
 */
public class MainTest {

    public static void main(String[] args) {

        WulinSimpleFactory wulinSimpleFactory = new WulinSimpleFactory();

        AbstractCar van = wulinSimpleFactory.newCar("van");
        AbstractCar mini = wulinSimpleFactory.newCar("mini");
        AbstractCar zz = wulinSimpleFactory.newCar("zz");

        System.out.println();
        System.out.println(mini);
        System.out.println(zz);


    }
}