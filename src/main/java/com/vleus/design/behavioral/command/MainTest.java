package com.vleus.design.behavioral.command;

/**
 * @author vleus
 * @date 2021年06月07日 23:38
 */
public class MainTest {

    public static void main(String[] args) {
        TeacherInvoker teacherInvoker = new TeacherInvoker();

        teacherInvoker.setCommand(new OnlineCommand());
        teacherInvoker.call();

    }
}