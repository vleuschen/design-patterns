package com.vleus.design.behavioral.state;

/**
 * @author vleus
 * @date 2021年06月06日 16:19
 */
public class VocationState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("在三亚度假，真舒服，不想打游戏。。。");
    }

    //切换到下一个状态
    @Override
    public TeamState next() {
        return new EatBeefNoodlesState();
    }
}