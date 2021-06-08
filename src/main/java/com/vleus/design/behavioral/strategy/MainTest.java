package com.vleus.design.behavioral.strategy;

/**
 * @author vleus
 * @date 2021年06月06日 16:08
 */
public class MainTest {

    public static void main(String[] args) {
        TeamRNG teamRNG = new TeamRNG();

        teamRNG.setGameStrategy(new UziStrategy());

        teamRNG.startGame();

        System.out.println("----------------------");

        teamRNG.setGameStrategy(new SteadyGameStrategy());
        teamRNG.startGame();
    }
}