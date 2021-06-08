package com.vleus.design.behavioral.mediator;

/**
 * @author vleus
 * @date 2021年06月06日 16:51
 */
public class Wuhu8778 extends Captain{

    @Override
    void fly() {
        System.out.println("芜湖塔台准备起飞....");
        //问每个机长能否起飞
        controlTower.acceptRequest(this,"fly");
    }

    @Override
    void land() {
        System.out.println("芜湖航班准备降落。。。");
        controlTower.acceptRequest(this,"land");
    }

    @Override
    void success() {
        System.out.println("起飞完成。。。。");
        controlTower.acceptRequest(this,"success");
    }
}