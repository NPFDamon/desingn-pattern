package com.cn.template;

/**
 * PC游戏，子类
 */
public class PLayPCGame extends PlayGame {
    @Override
    void choseGame(String game) {
        System.out.println("Chose PC Game: " + game);
    }

    @Override
    void loadGame(String game) {
        System.out.println("Load PC Game: " + game);
    }

    @Override
    void playGame(String game) {
        System.out.println("Play PC Game: " + game);
    }

    @Override
    void endGame(String game) {
        System.out.println("End PC Game: " + game);
    }

}
