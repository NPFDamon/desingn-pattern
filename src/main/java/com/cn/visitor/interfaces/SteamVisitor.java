package com.cn.visitor.interfaces;

import com.cn.visitor.interfaces.impl.GameNews;
import com.cn.visitor.interfaces.impl.GameRecommend;
import com.cn.visitor.interfaces.impl.Steam;
import com.cn.visitor.interfaces.impl.SteamMarket;

/**
 * 抽象访问者
 * 不同的访问者访问会有不同的执行结果
 */
public interface SteamVisitor {
    void visit(GameNews gameNews);

    void visit(GameRecommend gameRecommend);

    void visit(SteamMarket steamMarket);

    void visit(Steam steam);
}
