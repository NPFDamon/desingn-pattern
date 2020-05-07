package com.cn.visitor.interfaces.impl;

import com.cn.visitor.interfaces.SteamVisitor;
import com.cn.visitor.interfaces.impl.GameNews;
import com.cn.visitor.interfaces.impl.GameRecommend;
import com.cn.visitor.interfaces.impl.Steam;
import com.cn.visitor.interfaces.impl.SteamMarket;

/**
 * 具体访问者2
 */
public class SteamVisitorManager implements SteamVisitor {
    @Override
    public void visit(GameNews gameNews) {
        System.out.println("Publish game news");
    }

    @Override
    public void visit(GameRecommend gameRecommend) {
        System.out.println("Publish recommend news");
    }

    @Override
    public void visit(SteamMarket steamMarket) {
        System.out.println("Manager game market");
    }

    @Override
    public void visit(Steam steam) {
        System.out.println("visit steam manager");
    }
}
