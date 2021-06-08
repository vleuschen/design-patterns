package com.vleus.design.behavioral.memento;

import java.lang.reflect.InvocationTargetException;

/**
 * @author vleus
 * @date 2021年06月07日 23:03
 * 1、备忘录的设计（提取属性）；
 * 2、备忘录对象和原对象的互转操作（BeanUtils属性对拷）
 *  序列化
 *  保存数据库
 */
public class MainTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        UziGamer uziGamer = new UziGamer();

        uziGamer.playGame();
        uziGamer.saveGameRecord();

        uziGamer.playGame();

        uziGamer.playGame();

        uziGamer.saveGameRecord();

        UziGamer fromMemento = uziGamer.getFromMemento(1);

        fromMemento.playGame();
    }
}