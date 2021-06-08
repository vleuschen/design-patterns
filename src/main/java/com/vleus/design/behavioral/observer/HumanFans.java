package com.vleus.design.behavioral.observer;

/**
 * @author vleus
 * @date 2021年06月06日 17:57
 */
public class HumanFans extends AbstractFans{

    @Override
    void acceptMsg(String msg) {
        System.out.println("粉丝说主播说：" +msg);
    }
}