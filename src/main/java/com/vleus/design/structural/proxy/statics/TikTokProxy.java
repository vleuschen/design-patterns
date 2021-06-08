package com.vleus.design.structural.proxy.statics;

import com.vleus.design.structural.decorator.BingTikTok;

/**
 * @author vleus
 * @date 2021年06月02日 22:40
 * @desc 静态代理类，代理一般都是和被代理对象实现同一个接口
 */
public class TikTokProxy implements TikTok{

    private BingTikTok bingTikTok; //被代理对象

    public TikTokProxy(BingTikTok bingTikTok) {
        this.bingTikTok = bingTikTok;
    }


    @Override
    public void tiktok() {

        System.out.println("杭州分冰正在直播。。。");
        bingTikTok.tiktok();
    }
}