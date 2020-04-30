package com.cn.adapter;

import com.cn.adapter.interfaces.impl.NSSwitchWithPlugIn;
import com.cn.adapter.interfaces.impl.PlayStation4WithPlugIn;
import com.cn.adapter.interfaces.impl.PlayStation4;

/**
 * 适配器模是作为兼容两个不兼容接口之间的桥梁。
 * 将一个类的接口转换成客户希望的另一个接口，适配器模式使得原本由于接口不能在一起工作的那些类可以在一起工作。
 */
public class Test {
    public static void main(String[] args){
        PlayStation4WithPlugIn ps4 = new PlayStation4WithPlugIn();
        ps4.playGame("PS","God Of War");
        ps4.playGame("NS","Super Mario Bros");
        ps4.playGame("Xbox","War Machine");
        PlayStation4 ps4Mini = new PlayStation4();
        ps4Mini.playGame("PS","God Of War");
        ps4Mini.playGame("NS","Super Mario Bros");
        ps4Mini.playGame("Xbox","War Machine");
        NSSwitchWithPlugIn nsSwitchWithPlugIn = new NSSwitchWithPlugIn();
        nsSwitchWithPlugIn.playGame("PS","God Of War");
        nsSwitchWithPlugIn.playGame("NS","Super Mario Bros");
        nsSwitchWithPlugIn.playGame("Xbox","War Machine");
    }
}
