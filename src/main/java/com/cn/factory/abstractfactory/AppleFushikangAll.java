package com.cn.factory.abstractfactory;

import com.cn.factory.factorymethod.Mac;
import com.cn.factory.factorymethod.PC;
import com.cn.factory.staticfactory.ApplePhone;
import com.cn.factory.staticfactory.Phone;

public class AppleFushikangAll implements Fushikang{
    public PC getPC() {
        return new Mac();
    }

    public Phone getPhone() {
        return new ApplePhone();
    }
}
