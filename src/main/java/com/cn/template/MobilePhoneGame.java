package com.cn.template;

/**
 * 手机游戏，子类
 */
public class MobilePhoneGame extends PlayGame {
    @Override
    void choseGame(String game) {
        System.out.println("Chose Mobile Phone Game: " + game);
    }

    @Override
    void loadGame(String game) {
        System.out.println("Load Mobile Phone Game: " + game);
    }

    @Override
    void playGame(String game) {
        System.out.println("Play Mobile Phone Game: " + game);
    }

    @Override
    void endGame(String game) {
        System.out.println("End Mobile Phone Game: " + game);
    }

}
