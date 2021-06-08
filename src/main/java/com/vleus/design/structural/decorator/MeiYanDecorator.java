package com.vleus.design.structural.decorator;

/**
 * @author vleus
 * @date 2021年06月02日 22:09
 * @desc 美颜装饰器
 */
public class MeiYanDecorator implements TikTokDecorator{

    private BingTikTok bingTikTok;

    public MeiYanDecorator(BingTikTok bingTikTok) {
        this.bingTikTok = bingTikTok;
    }

    @Override
    public void tiktok() {
        //开启美颜效果
        enableMeiYan();

        bingTikTok.tiktok();
    }

    /**
     * 定义的增强功能
     */
    @Override
    public void enableMeiYan() {
        System.out.println("看这个美女....");
        System.out.println("花花花花花....");
    }
}