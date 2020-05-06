package com.cn.state;

public class CallState implements State {
    @Override
    public void doAction(MobilePhone phone) {
        phone.setState(this);
    }

    public String state() {
        return "Call State";
    }

}
