package com.vleus.design.behavioral.command;

/**
 * @author vleus
 * @date 2021年06月07日 23:35
 */
public class TeacherInvoker {

    Command command;

    public void call() {
        //命令
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}