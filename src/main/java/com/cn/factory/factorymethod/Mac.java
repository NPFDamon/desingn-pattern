package com.cn.factory.factorymethod;

public class Mac implements PC{
    public void brand() {
        System.out.println("This is Mac!");
    }

    public void system() {
        System.out.println("Use MacOS system!");
    }
}
