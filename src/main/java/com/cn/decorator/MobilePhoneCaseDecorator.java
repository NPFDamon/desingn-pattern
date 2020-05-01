package com.cn.decorator;

/**
 * 手机壳装饰器
 */
public class MobilePhoneCaseDecorator extends MobilePhoneDecorator{
    public MobilePhoneCaseDecorator(MobilePhone mobilePhone) {
        super(mobilePhone);
    }
//
//    @Override
//    public void photo() {
    //可在此处增加适配器内容
//        setMobilePhoneCase();
//        mobilePhone.photo();
//    }
//
//    @Override
//    public void call() {
//        setMobilePhoneCase();
//        mobilePhone.call();
//    }

    //自己定义的装饰内容
    public void setMobilePhoneCase(){
        System.out.println("Your phone with a beautiful mobile phone case!");
    }
}
