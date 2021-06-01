package com.vleus.design.creation.factory.abstractfactory;

/**
 * @author vleus
 * @date 2021年05月31日 23:25
 */
public class CommonMask extends AbstractMask{

    public CommonMask() {
        price = 1;
    }

    @Override
    public void protectMe() {
        System.out.println("普通口罩。。。简单保护。。。请及时更换");
    }
}