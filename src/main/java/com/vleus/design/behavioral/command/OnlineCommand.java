package com.vleus.design.behavioral.command;

/**
 * @author vleus
 * @date 2021年06月07日 23:34
 */
public class OnlineCommand implements Command{

    private ChenReceiver chenReceiver = new ChenReceiver();

    @Override
    public void execute() {
        System.out.println("要去上（吹）课（牛）。。。。");
        chenReceiver.online();
    }
}