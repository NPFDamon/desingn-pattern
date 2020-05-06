package com.cn.template;

/**
 * 模板抽象类
 */
public abstract class PlayGame {
    abstract void choseGame(String gameName);

    abstract void loadGame(String gameName);

    abstract void playGame(String gameName);

    abstract void endGame(String gameName);

    public void chosePlayTools() {
        System.out.println("Use Tools Play Game Like: VR ect");
    }

    public void hookMethodChosePlatform() {
        System.out.println("Play game is so funny");
    }

    //钩子函数
    public boolean hookMethod() {
        return false;
    }

    public void play(String gameName) {
        if (hookMethod()) {
            chosePlayTools();
        }
        choseGame(gameName);
        loadGame(gameName);
        playGame(gameName);
        endGame(gameName);
        hookMethodChosePlatform();

    }


}
