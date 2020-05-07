package com.cn.visitor.interfaces.impl;

import com.cn.visitor.interfaces.SteamPart;
import com.cn.visitor.interfaces.SteamVisitor;

/**
 * 具体元素
 */
public class Steam implements SteamPart {
    SteamPart[] steamParts;

    //对象结构
    public Steam() {
        steamParts = new SteamPart[]{new GameNews(), new GameRecommend(), new SteamMarket()};
    }

    @Override
    public void visit(SteamVisitor visitor) {
        visitor.visit(this);
        for (SteamPart part : steamParts) {
            part.visit(visitor);
        }
    }
}
