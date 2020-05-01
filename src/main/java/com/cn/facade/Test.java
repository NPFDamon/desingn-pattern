package com.cn.facade;

/**
 * 外观模式；隐藏了系统的复杂性，并向客户端提供一个客户端可以访问系统的接口；
 * 为子系统的一组接口提供一个高层接口，这个接口使得子系统更容易使用
 */
public class Test {
    public static void main(String[] args){
        DigitalPackage digitalPackage = new DigitalPackage();

        digitalPackage.package3();
    }
}
