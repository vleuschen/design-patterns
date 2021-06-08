package com.vleus.design.behavioral.state;

/**
 * @author vleus
 * @date 2021年06月06日 16:20
 */
public class EatBeefNoodlesState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("恰牛肉面恰饱饱。。。。");
    }

    @Override
    public TeamState next() {
        return new MatchState();
    }
}