package com.cn.bridge.brand;

import com.cn.bridge.Phone;

public class MiPhone extends PhoneBrand{
    public MiPhone(Phone phone) {
        super(phone);
    }

    public void call() {
        phone.call();
    }

    public void internet() {
        phone.internet();
    }

    public void brand() {
        System.out.println("This is Mi Phone!");
    }
}
