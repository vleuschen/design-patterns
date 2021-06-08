package com.vleus.design.structural.proxy.statics;

import com.vleus.design.structural.decorator.BingTikTok;

/**
 * @author vleus
 * @date 2021年06月02日 22:44
 */
public class MainTest {

    public static void main(String[] args) {

        //静态代理，就是装饰器，装饰器模式是代理模式的一种
        TikTokProxy tikTokProxy = new TikTokProxy(new BingTikTok());
        tikTokProxy.tiktok();

    }
}