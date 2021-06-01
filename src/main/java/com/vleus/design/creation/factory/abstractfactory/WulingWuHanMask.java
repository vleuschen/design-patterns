package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:31
 * @desc 负责造口罩
 */
public class WulingWuHanMask extends WulinkFacory{
    @Override
    AbstractCar newCar() {
        return null;
    }

    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}