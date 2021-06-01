package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:23
 * @desc 具体口罩产品
 */
public class N95Mask extends AbstractMask{

    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protectMe() {
        System.out.println("N95口罩。。。。超级防护");
    }
}