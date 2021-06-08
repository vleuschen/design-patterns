package com.vleus.design.structural.flyweight;

/**
 * @author vleus
 * @date 2021年06月03日 23:45
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("");
        waitress.service();
        System.out.println(waitress);

        AbstractWaitressFlyweight waitress1 = ZuDao.getWaitress("");
        waitress1.service();

        AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("");
        waitress2.service();

    }
}