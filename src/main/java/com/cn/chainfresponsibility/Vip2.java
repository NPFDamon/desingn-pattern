package com.cn.chainfresponsibility;

public class Vip2 extends Vip {
    public Vip2(Integer level) {
        this.level = level;
    }

    @Override
    void message() {
        System.out.println("This is level" + level + ",you can watch tv no ads and watch 1080p video ");
    }
}
