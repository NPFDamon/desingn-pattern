package com.cn.decorator;

public class IPhone implements MobilePhone{
    @Override
    public void call() {
        System.out.println("IPhone call!");
    }

    @Override
    public void photo() {
        System.out.println("Iphone photo!");
    }
}
