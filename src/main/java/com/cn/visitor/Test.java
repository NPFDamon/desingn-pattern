package com.cn.visitor;

import com.cn.visitor.interfaces.SteamPart;
import com.cn.visitor.interfaces.impl.Steam;
import com.cn.visitor.interfaces.impl.SteamVisitorManager;
import com.cn.visitor.interfaces.impl.SteamVisitorUser;

/**
 * 访问者模式；使用一个访问者类，它改变了元素类的执行算法，元素的执行算法可以随着访问者的改变而改变
 */
public class Test {
    public static void main(String[] args) {
        SteamPart steam = new Steam();
        steam.visit(new SteamVisitorUser());
        steam.visit(new SteamVisitorManager());
    }
}
