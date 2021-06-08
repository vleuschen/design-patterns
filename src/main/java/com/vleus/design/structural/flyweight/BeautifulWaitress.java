package com.vleus.design.structural.flyweight;

import lombok.AllArgsConstructor;

/**
 * @author vleus
 * @date 2021年06月03日 23:33
 * @desc 具体享元类
 */
@AllArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight{

    String id; //工号

    String name; //名字

    int age; //年龄
    //以上是不变的



    @Override
    void service() {
        System.out.println("工号: "+ id + "; " + name + " " + age + "正在为您服务。。。");

        //改变外部状态
        this.canService = false;
    }

    @Override
    void end() {
        System.out.println("工号: "+ id + "; " + name + " " + age + "服务结束。。。");

        this.canService = true;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BeautifulWaitress{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}