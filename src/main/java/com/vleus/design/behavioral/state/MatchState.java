package com.vleus.design.behavioral.state;

/**
 * @author vleus
 * @date 2021年06月06日 16:18
 */
public class MatchState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("全力以赴打比赛...");
    }

    @Override
    public TeamState next() {
        return new VocationState();
    }
}