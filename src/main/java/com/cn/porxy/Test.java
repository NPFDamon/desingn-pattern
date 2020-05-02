package com.cn.porxy;

import com.cn.porxy.cglib.InternetFactory;
import com.cn.porxy.dynamicproxy.InternetHandler;
import com.cn.porxy.staticproxy.CHNInternet;
import com.cn.porxy.staticproxy.Internet;
import com.cn.porxy.staticproxy.ProxyInternet;

/***
 * 代理模式
 * 为其他对象提供一种代理以控制这个对象的访问
 */
public class Test {
    public static void main(String[] args){
        //无代理
        CHNInternet chnInternet = new CHNInternet();
        chnInternet.internet();
        //静态代理
        ProxyInternet proxyInternet = new ProxyInternet();
        proxyInternet.internet();
        //JDK代理
        InternetHandler handler = new InternetHandler();
        Internet net = (Internet) handler.newProxyInstance(new CHNInternet());
        net.internet();
        //cglib代理
        Internet factory = (Internet) new InternetFactory(new CHNInternet()).getInstance();
        factory.internet();
    }
}
