package com.cn.decorator;

public class SamsungGalaxy implements MobilePhone{
    @Override
    public void call() {
        System.out.println("Samsung call!");
    }

    @Override
    public void photo() {
        System.out.println("Samsung photo!");
    }
}
