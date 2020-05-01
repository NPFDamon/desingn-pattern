package com.cn.facade;

public class EarPhone implements DigitalProduct{
    @Override
    public void sale() {
        System.out.println("EarPhone Sale!");
    }
}
