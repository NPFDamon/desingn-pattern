package com.cn.facade;

public class Phone implements DigitalProduct{
    @Override
    public void sale() {
        System.out.println("Phone Sale!");
    }
}
