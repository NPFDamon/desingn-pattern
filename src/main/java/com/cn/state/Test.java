package com.cn.state;

/**
 * 状态模式
 * 允许对象在内部状态发生改变时改变他的行为
 */
public class Test {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone(new StandBy());
        phone.getState();
        //状态做改变
        CallState callState = new CallState();
        callState.doAction(phone);
        phone.getState();
        InternetState internetState = new InternetState();
        internetState.doAction(phone);
        phone.getState();
        PowerOffState powerOffState = new PowerOffState();
        powerOffState.doAction(phone);
        phone.getState();

        //手机更改状态
        phone.setState(new CallState());
        phone.getState();
        phone.setState(new PowerOffState());
        phone.getState();
    }
}
