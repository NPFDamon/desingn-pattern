package com.cn.state;

public class StandBy implements State {
    @Override
    public void doAction(MobilePhone phone) {
        phone.setState(this);
    }

    @Override
    public String state() {
        return "Stand By";
    }
}
