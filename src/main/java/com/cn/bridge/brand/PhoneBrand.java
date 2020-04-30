package com.cn.bridge.brand;

import com.cn.bridge.Phone;

public abstract class PhoneBrand implements Phone {
    protected Phone phone;
    protected PhoneBrand(Phone phone){
        this.phone = phone;
    }

    public abstract void call();

    public abstract void internet();

    public abstract void brand();
}
