package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:29
 * @desc 具体工厂，只造车
 */
public class WulingRacingCarFactory extends WulinkFacory{
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}