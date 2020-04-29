package com.cn.builder.interfaces.impl;

import com.cn.builder.interfaces.CPU;

public class A14 implements CPU {
    public String CPUBrand() {
        //System.out.println("Apple A14 CPU");
        return "A14";
    }

    public String version() {
        //System.out.println("Apple A14");
        return "14.0";
    }

    public String price() {
        //System.out.println("Apple A14 $250");
        return "$250";
    }

}
