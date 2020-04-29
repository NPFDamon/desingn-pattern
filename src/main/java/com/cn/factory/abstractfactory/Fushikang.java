package com.cn.factory.abstractfactory;

import com.cn.factory.factorymethod.PC;
import com.cn.factory.staticfactory.Phone;

/**
 * 抽象工厂
 */
public interface Fushikang {
    PC getPC();
    Phone getPhone();
}
