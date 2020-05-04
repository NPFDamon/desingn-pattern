package com.cn.interpreter;

public class Game {
    private String gameName;
    private String gameIsbn;
    private String saleDate;

    public Game(String gameName, String gameIsbn, String saleDate) {
        this.gameIsbn = gameIsbn;
        this.gameName = gameName;
        this.saleDate = saleDate;
    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameIsbn() {
        return gameIsbn;
    }

    public void setGameIsbn(String gameIsbn) {
        this.gameIsbn = gameIsbn;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
}
