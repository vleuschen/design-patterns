package com.vleus.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vleus
 * @date 2021年06月03日 22:53
 */
public class Menu {

    private Integer id;

    private String name;

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //组合模式关注点
    private List<Menu> childs = new ArrayList<>();

    //提供添加层级的方法
    void addChildMenu(Menu menu){
        childs.add(menu);
    }

    void printMenu() {
        System.out.println(name);
        if (childs.size() > 0) {
            for (Menu child : childs) {
                child.printMenu();
            }
        }

    }
}