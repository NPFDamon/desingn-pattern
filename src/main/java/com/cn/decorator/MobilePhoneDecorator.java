package com.cn.decorator;

/**
 * 装饰器抽象方法
 */
public abstract class MobilePhoneDecorator implements MobilePhone {
    protected MobilePhone mobilePhone;

    public MobilePhoneDecorator(MobilePhone mobilePhone){
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void call() {
        mobilePhone.call();
    }

    @Override
    public void photo() {
        mobilePhone.photo();
    }
}
