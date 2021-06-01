package com.vleus.design.structural.bridge;

/**
 * @author vleus
 * @date 2021年06月01日 23:35
 */
public class IPhone extends AbstractPhone{
    @Override
    String getPhone() {
        return "IPhone" + sale.getSaleInfo();
    }
}