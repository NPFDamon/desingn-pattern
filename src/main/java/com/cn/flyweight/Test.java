package com.cn.flyweight;

/**
 * 享元模式主要用于减少创建对象的数量，以减少内存占用和提高性能
 * 运用共享技术有效的支持大量细粒度的对象
 */
public class Test {
    public static void main(String[] args) {
        Steam.getGame("GTA-5");
        Steam.getGame("GTA-5");
    }
}
