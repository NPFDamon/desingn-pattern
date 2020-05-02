package com.cn.porxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * JDK动态代理尽支持实现接口的类
 * final Class<?>[] intfs = interfaces.clone();
 */
public class InternetHandler implements InvocationHandler {
    //目标对象
    private Object target;

    public Object newProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //invoke 调用被代理接口的方法时需要调用的，返回的值是被代理【接口】的一个实现类
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object res = null;
        try {
            res = method.invoke(target, args);
            //增强方法
            linkToAllInternet();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    //代理增强功能
    private void linkToAllInternet() {
        System.out.println("Use Internet Handler link to all network please wait .....");
        try {
            Thread.sleep(600);
        }catch (Exception e){
            System.out.println("Fail,please try again");
        }
        System.out.println("Successful, you can visit all network .....");
    }
}
