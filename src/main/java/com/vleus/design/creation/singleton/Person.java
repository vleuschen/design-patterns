package com.vleus.design.creation.singleton;

/**
 * @author vleus
 * @date 2021年05月30日 21:25
 */
public class Person {

    private String name;

    private String age;

    private Person() {
        System.out.println("创建了Person");
    }

    private volatile static Person instance;

    //基于懒汉式模式的双重检测锁的单例模式
    public static Person guiguBoss() {

        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    Person person = new Person();
                    instance = person;
                }
            }
        }
        return instance;
    }

}