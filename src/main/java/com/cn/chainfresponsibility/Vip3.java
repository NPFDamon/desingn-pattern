package com.cn.chainfresponsibility;

public class Vip3 extends Vip {
    public Vip3(Integer level) {
        this.level = level;
    }

    @Override
    void message() {
        System.out.println("This is level" + level + ",you can watch tv no ads and watch 1080p video and watch movie free");
    }
}
