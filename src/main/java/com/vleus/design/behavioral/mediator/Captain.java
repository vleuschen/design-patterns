package com.vleus.design.behavioral.mediator;

/**
 * @author vleus
 * @date 2021年06月06日 16:48
 * @desc 抽象机长
 */
public abstract class Captain {

    ControlTower controlTower = new ControlTower();

    //起飞
    abstract void fly();

    //降落
    abstract void land();

    //完成
    abstract void success();


}