package com.vleus.design.structural.decorator;

/**
 * @author vleus
 * @date 2021年06月02日 22:04
 */
public class BingTikTok implements TikTok {
    @Override
    public void tiktok() {
        System.out.println("王冰冰，tiktok....");
    }
}