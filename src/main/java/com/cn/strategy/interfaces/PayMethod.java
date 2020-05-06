package com.cn.strategy.interfaces;

import com.cn.strategy.PayResult;

/**
 * 支付方式，策略接口
 */
public interface PayMethod {
    PayResult pay(String userId, double amount, String userName);
}
