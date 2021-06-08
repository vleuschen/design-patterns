package com.vleus.design.behavioral.state;

public interface TeamState {

    //玩游戏的状态
    void playGame();

    //切换到下一个状态
    TeamState next();
}
