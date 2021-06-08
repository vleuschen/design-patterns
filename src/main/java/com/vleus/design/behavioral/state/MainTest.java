package com.vleus.design.behavioral.state;

/**
 * @author vleus
 * @date 2021年06月06日 16:20
 */
public class MainTest {

    public static void main(String[] args) {

        SktTeam sktTeam = new SktTeam();
        VocationState state = new VocationState();
        sktTeam.setTeamState(state);

        sktTeam.startGame();
        sktTeam.nextState();
        sktTeam.startGame();
        sktTeam.nextState();
        sktTeam.startGame();
    }
}