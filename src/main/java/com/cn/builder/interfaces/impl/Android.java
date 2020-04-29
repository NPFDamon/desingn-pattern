package com.cn.builder.interfaces.impl;

import com.cn.builder.interfaces.OS;

public class Android implements OS {
    public String OS() {
        //System.out.println("Android OS");
        return "Android";
    }

    public String version() {
        //System.out.println("Android 11 or Android R");
        return "Android R";
    }
}
