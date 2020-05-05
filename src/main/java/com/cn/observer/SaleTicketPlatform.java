package com.cn.observer;

/**
 * 卖票平台
 * 抽象观察者
 */
public abstract class SaleTicketPlatform {
    protected MovieCenter movieCenter;
    protected abstract void update(String type);
}
