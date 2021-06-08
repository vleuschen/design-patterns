package com.vleus.design.behavioral.mediator;

/**
 * @author vleus
 * @date 2021年06月06日 16:53
 */
public class ControlTower {

    private boolean canDo = true;

    //接收请求
    public void acceptRequest(Captain captain,String action) {

        if ("fly".equals(action) || "land".equals(action)) {
            //起飞降落
            if (canDo) {
                System.out.println("允许...");
                canDo = false;
            }else{
                System.out.println("禁止...");
            }
        }

        if ("success".equals(action)) {
            canDo = true;
        }

    }
}