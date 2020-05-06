package com.cn.state;

public class InternetState implements State {
    @Override
    public void doAction(MobilePhone phone) {
        phone.setState(this);
    }

    @Override
    public String state() {
        return "Internet State";
    }
}
