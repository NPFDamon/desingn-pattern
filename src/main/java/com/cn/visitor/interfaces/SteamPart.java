package com.cn.visitor.interfaces;

/**
 * 抽象元素
 */
public interface SteamPart {
    void visit(SteamVisitor visitor);
}
