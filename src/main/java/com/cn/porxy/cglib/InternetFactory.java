package com.cn.porxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 * 字节码增强，利用asm开源包，对对象的class文件加载过来，通过修改其字节码生成子类来处理
 * 采用的是继承的方式所以不能对final类进行代理
 */
public class InternetFactory implements MethodInterceptor {
    private Object target;

    public InternetFactory(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object res = method.invoke(target, objects);
        linkToAllInternet();
        return res;
    }

    //代理增强功能
    private void linkToAllInternet() {
        System.out.println("Use Internet Factory link to all network please wait .....");
        try {
            Thread.sleep(600);
        } catch (Exception e) {
            System.out.println("Fail,please try again");
        }
        System.out.println("Successful, you can visit all network .....");
    }
}
