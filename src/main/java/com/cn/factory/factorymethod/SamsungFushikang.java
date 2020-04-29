package com.cn.factory.factorymethod;

import com.cn.factory.staticfactory.Phone;
import com.cn.factory.staticfactory.SamsungPhone;

public class SamsungFushikang extends AbstractFushikang{
    public Phone getPhone() {
        return new SamsungPhone();
    }
}
