package com.cn.builder;

import com.cn.builder.builders.MobileBuilderImpl;
import com.cn.builder.builders.MobileBuilder;
import com.cn.builder.interfaces.impl.*;
import com.cn.builder.products.ProductBuilder;

public class Test {
    public static void main(String[] args) {
        MobileBuilder appleBuilder = new MobileBuilderImpl();
        Director director = new Director(appleBuilder);
        director.constract(new A14(),new IOS(),"Apple XII",9999.00);
        System.out.println(appleBuilder.getPhone().toString());

        ProductBuilder miPhone = new ProductBuilder.Builder().setCPU(new Qualcomm()).setOS(new Android()).setBrand("Mi 10 pro").setPrice(5999.00).builder();

        System.out.println(miPhone.toString());

        ProductBuilder winPhone = new ProductBuilder.Builder().setCPU(new Intel9()).setOS(new Windows()).setBrand("Nokia").setPrice(4999.00).builder();
        System.out.println(winPhone.toString());
    }
}
