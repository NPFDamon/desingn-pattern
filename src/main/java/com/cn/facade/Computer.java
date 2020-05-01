package com.cn.facade;

public class Computer implements DigitalProduct{
    @Override
    public void sale() {
        System.out.println("Computer Sale");
    }
}
