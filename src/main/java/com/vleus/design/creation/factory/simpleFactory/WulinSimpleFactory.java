package com.vleus.design.creation.factory.simpleFactory;

/**
 * @author vleus
 * @date 2021年05月31日 22:11
 * @desc 简单工厂，产品数量少
 */
public class WulinSimpleFactory {

    //工厂的核心方法
    public AbstractCar newCar(String typeName) {
        if ("van".equals(typeName)) {
            return new VanCar();
        } else if ("mini".equals(typeName)) {
            return new MiniCar();
        }
        return null;
    }

}