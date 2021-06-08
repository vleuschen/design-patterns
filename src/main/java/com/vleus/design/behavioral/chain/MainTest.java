package com.vleus.design.behavioral.chain;

/**
 * @author vleus
 * @date 2021年06月08日 22:14
 */
public class MainTest {

    public static void main(String[] args) {

        Teacher chen = new Teacher("chenlaoshi");
        Teacher wulaoshi = new Teacher("wulaoshi");
        Teacher lianglaoshi = new Teacher("lianglaoshi");

        //构造链条
        chen.setNextTeacher(wulaoshi);
        wulaoshi.setNextTeacher(lianglaoshi);

        chen.handleRequest();

    }
}