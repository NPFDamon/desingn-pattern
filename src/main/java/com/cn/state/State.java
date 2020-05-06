package com.cn.state;

/**
 * 状态抽象类
 */
public interface State {
    void doAction(MobilePhone phone);
    String state();
}
