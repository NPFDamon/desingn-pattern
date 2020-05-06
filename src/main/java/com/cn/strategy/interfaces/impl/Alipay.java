package com.cn.strategy.interfaces.impl;

/**
 * 阿里支付。具体策略1
 */

import com.cn.strategy.PayResult;
import com.cn.strategy.interfaces.PayMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alipay implements PayMethod {
    @Override
    public PayResult pay(String userId, double amount, String userName) {
        PayResult payResult = new PayResult();
        payResult.setCode(userId + new SimpleDateFormat("yyyyMMdd").format(new Date()));
        payResult.setPayMethod("ALipay");
        payResult.setMsg("User: " + userName + " ALipay pay amount: " + amount + " use ALipay");
        try {
            //此处可执行付款，结算接口  Alipay.pay()
            payResult.setPayResult(true);
        } catch (Exception e) {
            payResult.setPayResult(false);
        }

        return payResult;
    }
}
