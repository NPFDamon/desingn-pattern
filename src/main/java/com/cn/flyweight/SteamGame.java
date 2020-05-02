package com.cn.flyweight;

public class SteamGame implements Game {
    private String gameName;

    public SteamGame(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public void playGame() {
        System.out.println("Play Game:" + gameName);
    }
}
