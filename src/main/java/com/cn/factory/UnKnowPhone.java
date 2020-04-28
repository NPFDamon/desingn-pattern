package com.cn.factory;

public class UnKnowPhone implements Phone{
    public void brand() {
        System.out.println("This is unknow Phone!");
    }

    public void system() {
        System.out.println("Can not know system!");
    }

    public String num() {
        return null;
    }

    public String internetModel() {
        return null;
    }
}
