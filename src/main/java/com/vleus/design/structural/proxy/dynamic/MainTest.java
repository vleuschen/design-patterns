package com.vleus.design.structural.proxy.dynamic;

import com.vleus.design.structural.proxy.statics.BingTiktok;
import com.vleus.design.structural.proxy.statics.TikTok;

/**
 * @author vleus
 * @date 2021年06月02日 22:50
 * @desc 动态代理模式
 *
 * 代理对象和目标对象的相同点在于都是同一个接口
 *
 */
public class MainTest {

    public static void main(String[] args) {

        TikTok bingTikTok = new BingTiktok();

        TikTok proxy = JdkTikTokProxy.getProxy(bingTikTok);

        proxy.tiktok();
    }
}