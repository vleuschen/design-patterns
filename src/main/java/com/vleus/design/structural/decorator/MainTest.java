package com.vleus.design.structural.decorator;

/**
 * @author vleus
 * @date 2021年06月02日 22:06
 */
public class MainTest {

    public static void main(String[] args) {
        BingTikTok bingTikTok = new BingTikTok();
//
//        bingTikTok.tiktok();

        MeiYanDecorator meiYanDecorator = new MeiYanDecorator(bingTikTok);
        meiYanDecorator.tiktok();

    }
}