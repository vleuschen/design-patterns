package com.vleus.design.creation.builder;

/**
 * @author vleus
 * @date 2021年06月01日 0:00
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractBuilder builder = new XiaomiBuilder();

        builder.customMem("16G");
        builder.customDisk("1T");
        builder.customCam("2亿");
        builder.customCpu("骁龙888");

        //链式建造者
        builder = builder.customCpu("骁龙888").
                customCam("2亿").
                customDisk("2T").
                customMem("16G");

        Phone product = builder.getProduct();

        System.out.println(product);
    }
}