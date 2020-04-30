package com.cn.builder.builders;

import com.cn.builder.Director;
import com.cn.builder.builders.MobileBuilderImpl;
import com.cn.builder.builders.MobileBuilder;
import com.cn.builder.interfaces.impl.*;
import com.cn.builder.products.ProductBuilder;

/**
 * 建造者模式：使用多个简单的对象一步一步建成一个复杂的对象
 * 将一个复杂的构建与其表示分离，使得同样的构建过程可以创建不同的表示
 */
public class Test {
    public static void main(String[] args) {
        //创建苹果手机
        MobileBuilder appleBuilder = new MobileBuilderImpl();
        Director director = new Director(appleBuilder);
        director.constract(new A14(),new IOS(),"Apple XII",9999.00);
        System.out.println(appleBuilder.getPhone().toString());
        //链式创建小米手机
        ProductBuilder miPhone = new ProductBuilder.Builder().setCPU(new Qualcomm()).setOS(new Android()).setBrand("Mi 10 pro").setPrice(5999.00).builder();
        System.out.println(miPhone.toString());
        //创建诺基亚手机
        ProductBuilder winPhone = new ProductBuilder.Builder().setCPU(new Intel9()).setOS(new Windows()).setBrand("Nokia").setPrice(4999.00).builder();
        System.out.println(winPhone.toString());
    }
}
