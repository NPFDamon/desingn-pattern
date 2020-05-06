package com.cn.strategy.interfaces.impl;

import com.cn.strategy.PayResult;
import com.cn.strategy.interfaces.PayMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 微信支付，具体支付2
 */
public class WeChatPay implements PayMethod {
    @Override
    public PayResult pay(String userId, double amount, String userName) {
        PayResult payResult = new PayResult();
        payResult.setCode(userId + new SimpleDateFormat("yyyyMMdd").format(new Date()));
        payResult.setPayMethod("WeChatPay");
        payResult.setMsg("User: " + userName + " WeChat pay amount: " + amount + " use WeChatPay");
        try {
            //此处可执行付款，结算接口  WeChatPay.pay()
            payResult.setPayResult(true);
        } catch (Exception e) {
            payResult.setPayResult(false);
        }

        return payResult;
    }
}
