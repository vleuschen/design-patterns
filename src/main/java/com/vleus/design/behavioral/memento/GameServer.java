package com.vleus.design.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vleus
 * @date 2021年06月07日 22:56
 * 管理者，记录所有的状态
 */
public class GameServer {

    //管理备忘录信息
    Map<Integer,GameRecord> records = new HashMap<>();
    int i = 1;

    void add(GameRecord gameRecord) {
        records.put(i++, gameRecord);
    }

    UziGamer getRecord(Integer id) {
        GameRecord gameRecord = records.get(id);

        //获取到备忘录里面的内容还需要逆转
        UziGamer uziGamer = new UziGamer();
        uziGamer.setCoin(gameRecord.coin);
        uziGamer.setHp(gameRecord.hp);
        uziGamer.setLevel(gameRecord.level);
        uziGamer.setMp(gameRecord.mp);

        return uziGamer;
    }
}