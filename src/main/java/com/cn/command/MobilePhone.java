package com.cn.command;

public class MobilePhone implements Phone {
    private String brand;
    private String os;

    public MobilePhone(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    @Override
    public void call() {
        System.out.println("Use " + brand + "Phone, os: " + os + " call!");
    }

    @Override
    public void ringOff() {
        System.out.println(brand + "Phone, os: " + os + " ring off !");
    }

    @Override
    public void internet() {
        System.out.println("Use " + brand + "Phone, os: " + os + " internet!");
    }

    @Override
    public void internetOff() {
        System.out.println(brand + "Phone, os: " + os + " internet off!");
    }
}
