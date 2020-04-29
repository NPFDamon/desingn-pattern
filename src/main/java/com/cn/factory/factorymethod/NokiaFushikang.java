package com.cn.factory.factorymethod;

import com.cn.factory.staticfactory.NokiaPhone;
import com.cn.factory.staticfactory.Phone;

public class NokiaFushikang extends AbstractFushikang{
    public Phone getPhone() {
        return new NokiaPhone();
    }
}
