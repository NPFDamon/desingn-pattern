package com.cn.builder.interfaces.impl;

import com.cn.builder.interfaces.CPU;

public class Intel9 implements CPU {
    public String CPUBrand() {
        return "Intel";
    }

    public String version() {
        return "Core i9";
    }

    public String price() {
        return "$233";
    }
}
