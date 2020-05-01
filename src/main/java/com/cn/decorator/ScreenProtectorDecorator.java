package com.cn.decorator;

/**
 * 屏保装饰器
 */
public class ScreenProtectorDecorator extends MobilePhoneDecorator {
    public ScreenProtectorDecorator(MobilePhone mobilePhone) {
        super(mobilePhone);
    }


//    @Override
//    public void call() {
//        setScreenProtector();
//        mobilePhone.call();
//    }
//
//    @Override
//    public void photo() {
//        setScreenProtector();
//        mobilePhone.photo();
//    }

    //装饰器新增功能
    public void setScreenProtector() {
        System.out.println("You phone with screen protector!");
    }
}
