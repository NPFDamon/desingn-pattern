package com.cn.factory.staticfactory;

public class NokiaPhone implements Phone{
    public void brand() {
        System.out.println("This is Nokia Phone!");
    }

    public void system() {
        System.out.println("Use Symbian system!");
    }

    public String num() {
        return null;
    }

    public String internetModel() {
        return null;
    }
}
