package com.vleus.design.structural.adapter;

/**
 * @author vleus
 * @date 2021年06月01日 22:46
 */
public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("正在播放: 小电影.avi");
        String content = "你好";
        System.out.println(content); //打印字母
        return content;
    }
}