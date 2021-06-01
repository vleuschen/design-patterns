package com.vleus.design.structural.bridge;

/**
 * @author vleus
 * @date 2021年06月01日 23:30
 */
public abstract class AbstractPhone {

    //桥接发生在此，设计期间想好
    //真正会引起此类变化的一个维度直接抽取出来，通过组合的方式接起来
    AbstractSale sale; //分离渠道
    /**
     * 当前手机的描述：拍照手机、性能手机等
     * @return
     */
    abstract String getPhone();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }
}