package com.vleus.design.behavioral.state;

/**
 * @author vleus
 * @date 2021年06月06日 16:17
 * @desc 环境类
 */
public class SktTeam {

    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    void startGame() {
        //状态不同可能会导致不同的游戏结果
        teamState.playGame();
    }

    //下一个状态
    void nextState() {
        teamState = teamState.next();
    }
}