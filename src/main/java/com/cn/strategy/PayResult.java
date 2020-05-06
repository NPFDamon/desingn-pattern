package com.cn.strategy;

/**
 * 支付结果
 */
public class PayResult {
    private String code;
    private boolean payResult;
    private String msg;
    private String payMethod;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isPayResult() {
        return payResult;
    }

    public void setPayResult(boolean payResult) {
        this.payResult = payResult;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Override
    public String toString() {
        return "PayResult{" +
                "code='" + code + '\'' +
                ", payResult=" + payResult +
                ", msg='" + msg + '\'' +
                ", payMethod='" + payMethod + '\'' +
                '}';
    }
}
