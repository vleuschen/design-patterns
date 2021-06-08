package com.vleus.design.behavioral.template;

/**
 * @author vleus
 * @date 2021年06月06日 15:49
 */
public abstract class CookieTemplate {

    /**
     * 定义算法：定义好的模板，关键性步骤留给子类实现
     */
    public void cook() {
        //定义算法步骤
        heating();
        addFood();
        addSalt();
        stirfry();
        end();
    }

    //加热方法
    public void heating() {
        System.out.println("准备开火。。。");
    }

    //添加食物
    public abstract void addFood();


    //加盐
    public abstract void addSalt();

    //翻炒
    public void stirfry() {
        System.out.println("翻炒中。。。");
    }

    //出锅
    public void end() {
        System.out.println("出锅。。。。");
    }

}