package com.cn.nullobject;

/**
 * 空对象模式：一个空对象取代null对象的实例检查
 */
public class Test {
    public static void main(String[] args){
        Phone phone1 = PhoneFactory.getPhone("IPhone");
        Phone phone2 = PhoneFactory.getPhone("Mi");
        Phone phone3 = PhoneFactory.getPhone("Samsung");
        Phone phone4 = PhoneFactory.getPhone("HuaWei");

        System.out.println("Phone:");
        System.out.println(phone1.getBrand());
        System.out.println(phone2.getBrand());
        System.out.println(phone3.getBrand());
        System.out.println(phone4.getBrand());
    }
}
