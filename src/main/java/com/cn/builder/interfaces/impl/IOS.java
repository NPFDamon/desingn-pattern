package com.cn.builder.interfaces.impl;

import com.cn.builder.interfaces.OS;

public class IOS implements OS {
    public String OS() {
        //System.out.println("IOS");
        return "IOS";
    }

    public String version() {
        //System.out.println("IOS 14");
        return "IOS 14";
    }
}
