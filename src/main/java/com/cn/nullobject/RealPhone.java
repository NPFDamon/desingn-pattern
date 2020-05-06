package com.cn.nullobject;

public class RealPhone extends Phone {
    public RealPhone(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
