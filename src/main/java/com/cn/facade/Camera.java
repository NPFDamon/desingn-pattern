package com.cn.facade;

public class Camera implements DigitalProduct{
    @Override
    public void sale() {
        System.out.println("Camera Sale!");
    }
}
