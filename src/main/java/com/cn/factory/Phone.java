package com.cn.factory;

/**
 * 工厂模式接口类
 * 用来定义具体产品的共同属性，工厂负责生产具体的产品
 *
 * 缺点：如果需要增加一个新的产品不仅需要增加一个新的导出类还需要修改getPhone方法
 */
public interface Phone {
    void brand();
    void system();
    String num();
    String internetModel();
}
