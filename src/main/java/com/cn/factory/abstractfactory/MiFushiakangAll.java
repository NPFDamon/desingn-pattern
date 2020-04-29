package com.cn.factory.abstractfactory;

import com.cn.factory.factorymethod.MiPC;
import com.cn.factory.factorymethod.PC;
import com.cn.factory.staticfactory.MiPhone;
import com.cn.factory.staticfactory.Phone;

public class MiFushiakangAll implements Fushikang{
    public PC getPC() {
        return new MiPC();
    }

    public Phone getPhone() {
        return new MiPhone();
    }
}
