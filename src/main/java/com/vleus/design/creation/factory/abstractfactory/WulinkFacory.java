package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:26
 * @desc 五菱总厂，指示啥都能造
 */
public abstract class WulinkFacory {

    abstract AbstractCar newCar();

    abstract AbstractMask newMask();
}