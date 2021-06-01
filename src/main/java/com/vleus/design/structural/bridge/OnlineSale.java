package com.vleus.design.structural.bridge;

/**
 * 线上渠道
 * @author vleus
 * @date 2021年06月01日 23:34
 */
public class OnlineSale extends AbstractSale{
    public OnlineSale(String type, Integer price) {
        super(type, price);
    }
}