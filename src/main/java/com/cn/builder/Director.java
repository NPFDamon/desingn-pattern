package com.cn.builder;

import com.cn.builder.builders.MobileBuilder;
import com.cn.builder.interfaces.CPU;
import com.cn.builder.interfaces.OS;

public class Director {
    MobileBuilder builder = null;
    public Director(MobileBuilder builder){
        this.builder = builder;
    }

    public void constract(CPU cpu, OS os,String brand,double price){
        builder.setCPU(cpu);
        builder.setOS(os);
        builder.setMobileBrand(brand);
        builder.setPrice(price);
    }
}
