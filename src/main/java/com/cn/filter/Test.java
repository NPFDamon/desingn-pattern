package com.cn.filter;

import java.util.ArrayList;
import java.util.List;

/***
 * 过滤器模式;使用不同的标准过滤一组对象，通过逻辑运算以解耦的方式把他们连接起来
 */
public class Test {
    public static void main(String[] args){
        Phone apple = new Phone("Apple","4G","IOS","Apple");
        Phone mi = new Phone("MI","5G","Android","Qualcomm");
        Phone samsung = new Phone("Samsung","5G","Android","Qualcomm");

        List<Phone> phones = new ArrayList<>();
        phones.add(apple);
        phones.add(mi);
        phones.add(samsung);

        Criteria appleList = new BrandCriteria();
        List<Phone> phoneList = appleList.filter(phones);
        printList(phoneList);

        Criteria qualcommPhone = new CPUCriteria();
        List<Phone> qualcommList = qualcommPhone.filter(phones);
        printList(qualcommList);
    }


    private static void printList(List<Phone> phones){
        phones.forEach(p ->{
            System.out.println("Phone:[Brand:"+p.getBrand()+",internetType:"+p.getInternetType()+",CPU:"+p.getCpu()+",OS:"+p.getOs()+"]");
        });
    }
}
