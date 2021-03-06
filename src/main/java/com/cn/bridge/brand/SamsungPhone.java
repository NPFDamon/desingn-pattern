package com.cn.bridge.brand;

import com.cn.bridge.Phone;
import com.cn.bridge.brand.PhoneBrand;

public class SamsungPhone extends PhoneBrand {
    public SamsungPhone(Phone phone) {
        super(phone);
    }

    public void call() {
        phone.call();
    }

    public void internet() {
        phone.internet();
    }

    public void brand() {
        System.out.println("This is Samsung Phone!");
    }
}
