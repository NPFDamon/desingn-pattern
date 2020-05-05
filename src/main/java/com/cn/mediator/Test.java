package com.cn.mediator;

/**
 * 中介者模式；用来降低对个对象和类之间的通讯复杂度。
 * 用一个中介对象封装一系列对象交互，中介者使各个对象不需要显示的相互引用
 */
public class Test {
    public static void main(String[] args) {
        GameCompany ea = new EACompany();
        GameCompany tencent = new TencentCompany();

        Steam steam = new Steam();
        //
        steam.publishGame(ea);
        steam.publishGame(tencent);

        User xiaoming = new User("346651644", "XiaoMing");

        steam.saleGame(xiaoming, ea);
        steam.saleGame(xiaoming, tencent);
    }
}
