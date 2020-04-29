package com.cn.factory;

import com.cn.factory.abstractfactory.MiFushiakangAll;
import com.cn.factory.factorymethod.AppleFushikang;
import com.cn.factory.factorymethod.PC;
import com.cn.factory.staticfactory.FuShiKang;
import com.cn.factory.staticfactory.Phone;

public class MakePhone {
    public static void main(String[] args){
        FuShiKang fuShiKang = new FuShiKang();

        Phone apple = fuShiKang.getPhone("iPhone");
        apple.brand();
        apple.system();

        Phone unknow = fuShiKang.getPhone(null);
        unknow.system();
        unknow.brand();

        AppleFushikang appleFushikang = new AppleFushikang();
        Phone applePhone = appleFushikang.getPhone();
        applePhone.brand();
        applePhone.system();

        MiFushiakangAll miFushikang = new MiFushiakangAll();
        Phone mi = miFushikang.getPhone();
        mi.brand();
        mi.system();
        PC miPc = miFushikang.getPC();
        miPc.brand();
        miPc.system();

    }
}
