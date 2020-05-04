package com.cn.command;

/**
 * 具体的命令
 */
public class InternetCommand implements Command {
    private Phone phone;

    public InternetCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.internet();
    }

    @Override
    public void undo() {
        phone.internetOff();
    }
}
