package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:30
 */
public class WulingVanCarFactory extends WulinkFacory{
    @Override
    AbstractCar newCar() {
        return new VanCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}