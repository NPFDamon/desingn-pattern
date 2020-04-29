package com.cn.singleton;

/**
 * 单例模式
 */
public class Singleton {
    private static Singleton singleton;

    //私有构造方法
    private Singleton(){}

    /**
     * 下面的方法互斥，一个类中只能保留一个
     */

    //获取唯一可用对象;懒汉模式，线程不安全
    public static Singleton getInstance(){
        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }

    //饿汉式
    private static final Singleton singletonInstance = new Singleton();
    public static Singleton getSingletonInstance(){
        return singletonInstance;
    }

    //懒汉模式，线程安全
    public static synchronized Singleton getInstanceSafe(){
        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }

    //双检查，线程安全
    private volatile static Singleton singletonDoubleCheck;
    public static Singleton getInstanceDoubleCheck(){
        if(singletonDoubleCheck == null){
            synchronized (Singleton.class){
                if(singletonDoubleCheck == null){
                    return new Singleton();
                }
            }
        }
        return singletonDoubleCheck;
    }

    //静态类
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstanceStaticClass(){
        return SingletonHolder.INSTANCE;
    }

}
