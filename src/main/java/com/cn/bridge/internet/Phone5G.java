package com.cn.bridge.internet;

import com.cn.bridge.Phone;

public class Phone5G implements Phone {
    public void call() {
        System.out.println("Phone use 5G internet call!");
    }

    public void internet() {
        System.out.println("Phone use 5G internet!");
    }
}
