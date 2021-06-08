package com.vleus.design.behavioral.observer;

/**
 * @author vleus
 * @date 2021年06月06日 17:50
 */
public abstract class AbstractTikToker {

    //添加粉丝
    abstract void addFans(AbstractFans abstractFans);

    //通知粉丝
    abstract void notifyFans(String msg);
}