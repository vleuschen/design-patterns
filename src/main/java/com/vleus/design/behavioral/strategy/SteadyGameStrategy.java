package com.vleus.design.behavioral.strategy;

/**
 * @author vleus
 * @date 2021年06月06日 16:07
 */
public class SteadyGameStrategy implements GameStrategy{

    @Override
    public void warStrategy() {
        System.out.println("稳健运营,蚕食对手获取胜利。。。");
    }
}