package com.cn.decorator;

/**
 * 装饰器模式;允许向一个现有的对象添加新功能，同时又不改变其结构
 * 动态的给一个对象增加一些额外的功能
 */
public class Test {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        MobilePhoneCaseDecorator iphoneWithCase = new MobilePhoneCaseDecorator(iPhone);
        ScreenProtectorDecorator iphoneWithScreenProtector = new ScreenProtectorDecorator(iPhone);

        iphoneWithCase.setMobilePhoneCase();
        iphoneWithScreenProtector.setScreenProtector();

        iPhone.call();
        iPhone.photo();
    }
}
