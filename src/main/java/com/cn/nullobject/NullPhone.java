package com.cn.nullobject;

public class NullPhone extends Phone {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getBrand() {
        return "Not Available in Phone Database";
    }
}
