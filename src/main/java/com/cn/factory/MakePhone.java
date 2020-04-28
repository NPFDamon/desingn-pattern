package com.cn.factory;

public class MakePhone {
    public static void main(String[] args){
        FuShiKang fuShiKang = new FuShiKang();

        Phone apple = fuShiKang.getPhone("iPhone");
        apple.brand();
        apple.system();

        Phone unknow = fuShiKang.getPhone(null);
        unknow.system();
        unknow.brand();
    }
}
