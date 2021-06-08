package com.vleus.design.behavioral.chain;

/**
 * @author vleus
 * @date 2021年06月08日 22:14
 */
public class Teacher {

    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    private Teacher nextTeacher; //下一个处理的老师

    public Teacher getNextTeacher() {
        return nextTeacher;
    }

    public void setNextTeacher(Teacher nextTeacher) {
        this.nextTeacher = nextTeacher;
    }

    void handleRequest(){
        System.out.println(this + "正在处理。。。");
        //下一个继续
        if (nextTeacher != null) {
            nextTeacher.handleRequest();
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Teacher{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}