package com.vleus.design.behavioral.observer;

/**
 * @author vleus
 * @date 2021年06月06日 17:52
 */
public abstract class AbstractFans {

    abstract void acceptMsg(String msg);

    void follow(AbstractTikToker tikToker) {
        //主播增加粉丝
        tikToker.addFans(this);
    }


}