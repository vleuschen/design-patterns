package com.vleus.design.behavioral.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * @author vleus
 * @date 2021年06月07日 22:47
 * 游戏者，游戏发起人
 * @当前游戏信息
 */
@Data
public class UziGamer {

    Integer coin; //剩余金币

    Integer hp; //血量

    Integer mp; //蓝量

    Integer level; //等级

    //以上的是内部状态,需要记录保存的信息
    GameServer gameServer = new GameServer();

    //保存游戏记录
    void saveGameRecord() throws InvocationTargetException, IllegalAccessException {
        System.out.println("正在保存当前记录。。。");
        GameRecord gameRecord = new GameRecord();
        //当前游戏信息保存到备忘录
        BeanUtils.copyProperties(gameRecord,this);

        gameServer.add(gameRecord);
    }

    //从备忘录获取游戏历史存档
    UziGamer getFromMemento(Integer id) {
        System.out.println("获取历史存档信息。。。");
        UziGamer record = gameServer.getRecord(id);

        return record;
    }

    //玩游戏
    void playGame() {

        int i = new Random().nextInt();
        System.out.println("打怪，升级，赚金币，打怪，爆史诗。。。" + i);
        coin = i;
        hp = i;
        mp = i;
        level = i;
    }

    void exitGame() throws InvocationTargetException, IllegalAccessException {
        System.out.println("游戏真垃圾，我退游了。。。");
        saveGameRecord();
    }

}