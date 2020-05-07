package com.cn.visitor.interfaces.impl;

import com.cn.visitor.interfaces.SteamPart;
import com.cn.visitor.interfaces.SteamVisitor;

/**
 * 具体元素
 */
public class SteamMarket implements SteamPart {
    @Override
    public void visit(SteamVisitor visitor) {
        visitor.visit(this);
    }
}
