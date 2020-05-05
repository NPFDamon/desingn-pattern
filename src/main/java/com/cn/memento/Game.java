package com.cn.memento;

/**
 * 备忘录角色
 */
public class Game {
    private String gameName;
    private String level;
    private String moreInfo;

    public Game(String gameName, String level, String moreInfo) {
        this.gameName = gameName;
        this.level = level;
        this.moreInfo = moreInfo;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", level='" + level + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
