package com.vleus.design.creation.singleton;

/**
 * @author vleus
 * @date 2021年05月30日 21:25
 */
public class MainTest {

    public static void main(String[] args) {

        Person person1 = Person.guiguBoss();
        Person person2 = Person.guiguBoss();

        System.out.println(person1 == person2);
    }
}