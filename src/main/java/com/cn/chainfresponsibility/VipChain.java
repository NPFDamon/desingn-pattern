package com.cn.chainfresponsibility;

//构造责任链
public class VipChain {
    //构造责任链
    public static Vip getVip() {
        Vip vip1 = new Vip1(1);
        Vip vip2 = new Vip2(2);
        Vip vip3 = new Vip3(3);
        vip1.setNextLevel(vip2);
        vip2.setNextLevel(vip3);
        return vip1;
    }
}
