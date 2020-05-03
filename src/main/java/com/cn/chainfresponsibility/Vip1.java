package com.cn.chainfresponsibility;

public class Vip1 extends Vip {
    public Vip1(Integer level) {
        this.level = level;
    }

 @Override
    void message() {
        System.out.println("This is level" + level + ",you can watch tv no ads");
    }
}
