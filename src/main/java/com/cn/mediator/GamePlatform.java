package com.cn.mediator;

/**
 * 抽象中介者 游戏平台
 * 用户可在平台购买各个游戏公司的游戏，游戏公司可发布游戏到平台（也可进行游戏公司之间的代理，现steam不支持，中介者支持（但是没有实现）），
 */
public interface GamePlatform {
    void publishGame(GameCompany company);

    void saleGame(User user, GameCompany gameCompany);
}
