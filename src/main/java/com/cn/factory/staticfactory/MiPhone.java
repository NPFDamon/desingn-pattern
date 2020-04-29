package com.cn.factory.staticfactory;

public class MiPhone implements Phone{
    public void brand() {
        System.out.println("This is Mi Phone!");
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
