package com.cn.visitor.interfaces.impl;

import com.cn.visitor.interfaces.SteamVisitor;

/**
 * 具体访问者1
 */
public class SteamVisitorUser implements SteamVisitor {
    @Override
    public void visit(GameNews gameNews) {
        System.out.println("visit steam game news");
    }

    @Override
    public void visit(GameRecommend gameRecommend) {
        System.out.println("visit steam recommend");
    }

    @Override
    public void visit(SteamMarket steamMarket) {
        System.out.println("visit steam market");
    }

    @Override
    public void visit(Steam steam) {
        System.out.println("user visit steam");
    }
}
