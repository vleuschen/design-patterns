package com.vleus.design.structural.facade;

/**
 * @author vleus
 * @date 2021年06月03日 23:08
 * @desc 门面模式
 */
public class WeiXinFacade {

    Police police = new Police();

    Edu edu = new Edu();

    public void handleXXX(String name) {
        police.register(name);
        edu.assignSchool(name);
    }
}