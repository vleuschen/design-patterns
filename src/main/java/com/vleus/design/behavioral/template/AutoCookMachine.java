package com.vleus.design.behavioral.template;

/**
 * @author vleus
 * @date 2021年06月06日 15:53
 */
public class AutoCookMachine extends CookieTemplate{

    @Override
    public void addFood() {
        System.out.println("放了三根娃娃菜。。。");
    }

    @Override
    public void addSalt() {
        System.out.println("放了一勺盐。。。");
    }
}