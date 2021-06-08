package com.vleus.design.behavioral.observer;

/**
 * @author vleus
 * @date 2021年06月06日 17:56
 */
public class MainTest {

    public static void main(String[] args) {

        MMTikToker mmTikToker = new MMTikToker();

        mmTikToker.startSell();

        HumanFans humanFans1 = new HumanFans();
        HumanFans humanFans2 = new HumanFans();
        HumanFans humanFans3 = new HumanFans();

        humanFans1.follow(mmTikToker);
        humanFans2.follow(mmTikToker);
        humanFans3.follow(mmTikToker);

        System.out.println("---------------------------");

        mmTikToker.enbSell();
    }
}