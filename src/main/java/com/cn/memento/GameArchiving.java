package com.cn.memento;

/**
 * 原发器；存储当前状态，也可恢复其内部状态
 */
public class GameArchiving {
    private String gameName;
    private String level;
    private String moreInfo;

    //保存状态
    public void saveInfo(String gameName, String level, String moreInfo) {
        this.gameName = gameName;
        this.level = level;
        this.moreInfo = moreInfo;
    }

    //获取当前状态的备忘录角色
    public Game getNowInfoGame() {
        return new Game(gameName, level, moreInfo);
    }

    //恢复状态
    public void restore(Game game) {
        this.moreInfo = game.getMoreInfo();
        this.level = game.getLevel();
        this.gameName = game.getGameName();
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
