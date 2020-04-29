package com.cn.builder.interfaces.impl;

import com.cn.builder.interfaces.CPU;

public class Qualcomm implements CPU {
    public String CPUBrand() {
        //System.out.println("Qualcomm CPU");
        return "Qualcomm";
    }

    public String version() {
        //System.out.println("Qualcomm 865");
        return "Qualcomm 865";
    }

    public String price() {
        //System.out.println("Qualcomm 865 $200");
        return "$200";
    }
}
