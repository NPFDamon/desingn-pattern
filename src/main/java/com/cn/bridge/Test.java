package com.cn.bridge;

import com.cn.bridge.brand.ApplePhone;
import com.cn.bridge.brand.SamsungPhone;
import com.cn.bridge.internet.Phone4G;
import com.cn.bridge.internet.Phone5G;
import com.cn.bridge.internet.Phone6G;

/**
 * 桥接模式;用于把抽象化与实例化解耦，使二者可以独立变化
 * 将抽象部分和实现部分分离，使他们可以独立变化
 */
public class Test {
    public static void main(String[] args){
        Phone apple4G = new ApplePhone(new Phone4G());
        apple4G.call();
        apple4G.internet();
        Phone apple6G = new ApplePhone(new Phone6G());
        apple6G.call();
        apple6G.internet();


        Phone samsung4G = new SamsungPhone(new Phone4G());
        samsung4G.call();

        Phone samsung5G = new SamsungPhone(new Phone5G());
        samsung5G.call();

    }
}
