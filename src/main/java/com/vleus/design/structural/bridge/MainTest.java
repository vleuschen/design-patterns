package com.vleus.design.structural.bridge;

/**
 * @author vleus
 * @date 2021年06月01日 23:36
 */
public class MainTest {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setSale(new OnlineSale("线上",9999));

        String phone = iPhone.getPhone();
        System.out.println(phone);
    }
}