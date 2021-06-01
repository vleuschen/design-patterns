package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:32
 */
public class WulingHangZhouMaskFactory extends WulinkFacory{
    @Override
    AbstractCar newCar() {
        return null;
    }

    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }
}