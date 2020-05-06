package com.cn.strategy;

import com.cn.strategy.interfaces.impl.Alipay;
import com.cn.strategy.interfaces.impl.WeChatPay;

/**
 * 策略模式；一个类的行为或者算法可在运行时进行更改；
 * 定义一个个算法，并把他们封装起来，并且他们可以互相替换
 */
public class Test {
    public static void main(String[] args) {
        Order order1 = new Order(new Alipay());
        PayResult payResult = order1.pay("001", 362.33, "Tom");
        System.out.println(payResult.toString());
        Order order2 = new Order(new WeChatPay());
        PayResult payResult2 = order2.pay("001", 362.33, "Tom");
        System.out.println(payResult2.toString());
    }
}
