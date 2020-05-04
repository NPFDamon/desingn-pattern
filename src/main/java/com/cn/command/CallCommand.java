package com.cn.command;

/**
 * 具体的命令
 */
public class CallCommand implements Command {
    private Phone phone;

    public CallCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.call();
    }

    @Override
    public void undo() {
        phone.ringOff();
    }
}
