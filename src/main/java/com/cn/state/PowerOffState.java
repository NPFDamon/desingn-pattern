package com.cn.state;

public class PowerOffState implements State{
    @Override
    public void doAction(MobilePhone phone) {
        phone.setState(this);
    }

    @Override
    public String state() {
        return "Power Off State";
    }
}
