package com.cn.template;

/**
 * 主机游戏，子类
 */
public class ConsoleGame extends PlayGame {
    @Override
    void choseGame(String game) {
        System.out.println("Chose Console Game: " + game);
    }

    @Override
    void loadGame(String game) {
        System.out.println("Load Console Game: " + game);
    }

    @Override
    void playGame(String game) {
        System.out.println("Play Console Game: " + game);
    }

    @Override
    void endGame(String game) {
        System.out.println("End Console Game: " + game);
    }

    @Override
    public boolean hookMethod() {
        return true;
    }
}
