package com.vleus.design.creation.factory.factorymethod;

/**
 * @author vleus
 * @date 2021年05月31日 22:28
 */
public class WulingVanCarFactory extends AbstractCarFactory{

    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}