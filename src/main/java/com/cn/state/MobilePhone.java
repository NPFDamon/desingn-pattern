package com.cn.state;

/**
 * 手机类，手机拥有各种状态
 */
public class MobilePhone {
    private State state;

    public MobilePhone(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getState() {
        System.out.println("Phone is " + state.state());
    }

}
