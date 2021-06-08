package com.vleus.design.behavioral.command;

/**
 * @author vleus
 * @date 2021年06月07日 23:33
 */
public class WuHuTravelCommand implements Command{

    private ChenReceiver chenReceiver = new ChenReceiver();

    @Override
    public void execute() {
        System.out.println("我要出（旅）差（游）。。。。");
        chenReceiver.travel();
    }
}