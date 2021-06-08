package com.vleus.design.behavioral.observer;

import com.vleus.design.structural.flyweight.AbstractWaitressFlyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vleus
 * @date 2021年06月06日 17:52
 */
public class MMTikToker extends AbstractTikToker {

    List<AbstractFans> fansList = new ArrayList<>();

    void startSell() {
        System.out.println("主播开始卖货了。。。");
        notifyFans("我开始卖货了，卖茅台。。。");
    }

    void enbSell() {

        System.out.println("主播货卖完了。。。");
        notifyFans("茅台已经卖完了");
    }

    @Override
    void addFans(AbstractFans abstractFans) {
        fansList.add(abstractFans);
    }

    /**
     * 通知粉丝
     */
    @Override
    void notifyFans(String msg) {
        //遍历粉丝
        for (AbstractFans abstractFans : fansList) {
            abstractFans.acceptMsg(msg);
        }
    }
}