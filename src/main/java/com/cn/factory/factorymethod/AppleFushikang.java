package com.cn.factory.factorymethod;

import com.cn.factory.staticfactory.ApplePhone;
import com.cn.factory.staticfactory.Phone;

public class AppleFushikang extends AbstractFushikang{
    public Phone getPhone() {
        return new ApplePhone();
    }
}
