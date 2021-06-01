package com.vleus.design.creation.factory.factorymethod;

/**
 * @author vleus
 * @date 2021年05月31日 22:29
 */
public class WulingRacingFactory extends AbstractCarFactory {

    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}