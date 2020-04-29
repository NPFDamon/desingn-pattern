package com.cn.factory.factorymethod;

import com.cn.factory.staticfactory.MiPhone;
import com.cn.factory.staticfactory.Phone;

public class MiFushikang extends AbstractFushikang{
    public Phone getPhone() {
        return new MiPhone();
    }
}
