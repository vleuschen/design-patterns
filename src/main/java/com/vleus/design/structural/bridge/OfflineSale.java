package com.vleus.design.structural.bridge;

/**
 * @author vleus
 * @date 2021年06月01日 23:34
 * @desc 线下渠道
 */
public class OfflineSale extends AbstractSale{
    public OfflineSale(String type, Integer price) {
        super(type, price);
    }
}