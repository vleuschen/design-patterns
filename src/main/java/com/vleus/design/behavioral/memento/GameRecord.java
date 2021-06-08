package com.vleus.design.behavioral.memento;

import lombok.Data;

/**
 * @author vleus
 * @date 2021年06月07日 22:53
 */
@Data
public class GameRecord {

    Integer id;

    Integer coin; //剩余金币

    Integer hp; //血量

    Integer mp; //蓝量

    Integer level; //等级

    //获取当前备忘录信息
    void getCurrent() {
        System.out.println("coin: " + coin);
    }


}