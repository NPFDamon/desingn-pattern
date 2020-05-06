package com.cn.strategy;

import com.cn.strategy.interfaces.PayMethod;

/**
 * 账单，使用具体某一支付策略
 */
public class Order {
    private final PayMethod payMethod;

    public Order(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public PayResult pay(String userId, double amount, String userName) {
        return payMethod.pay(userId, amount, userName);
    }
}
