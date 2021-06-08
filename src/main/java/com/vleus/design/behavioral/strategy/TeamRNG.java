package com.vleus.design.behavioral.strategy;

/**
 * @author vleus
 * @date 2021年06月06日 16:04
 */
public class TeamRNG {

    //抽取游戏策略算法，并进行引用
    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame() {

        System.out.println("全军出击。。。");

        //使用游戏套路
        gameStrategy.warStrategy();

        System.out.println("Victory。。。。。");
    }
}