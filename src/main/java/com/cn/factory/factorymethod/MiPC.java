package com.cn.factory.factorymethod;

public class MiPC implements PC{
    public void brand() {
        System.out.println("This is Mi PC!");
    }

    public void system() {
        System.out.println("Use Windows system!");
    }
}
