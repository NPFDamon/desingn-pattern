package com.cn.factory;

public class SamsungPhone implements Phone{
    public void brand() {
        System.out.println("This is Samsung Phone!");
    }

    public void system() {
        System.out.println("Use Android system!");
    }

    public String num() {
        return null;
    }

    public String internetModel() {
        return null;
    }
}
