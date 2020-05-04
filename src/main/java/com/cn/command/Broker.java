package com.cn.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker 要求命令对象的执行请求，持有命令对象，可以持有多个命令。客户端真正触发命令并命令执行相应操作的地方，相当于命令对象的入口
 */
public class Broker {

    private List<Command> list = new ArrayList<>();

    public void takeCommand(Command command) {
        list.add(command);
    }

    public void placeCommands() {
        list.forEach(Command::execute);
    }

    public void cancelCommands() {
        list.forEach(Command::undo);
    }

}
