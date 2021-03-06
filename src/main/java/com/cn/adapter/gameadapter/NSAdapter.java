package com.cn.adapter.gameadapter;

import com.cn.adapter.interfaces.GameMachine;
import com.cn.adapter.interfaces.impl.NintendoSwitch;
import com.cn.adapter.interfaces.impl.XboxOneX;

/**
 * ns适配器 可选择适配ps和Xbox
 */
public class NSAdapter implements GameMachine {
    GameMachine gameMachine;
    public NSAdapter(GameMachine gameMachine){
        this.gameMachine = gameMachine;
    }
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("Xbox")){
            gameMachine = new XboxOneX();
        }else if(gameType.equals("NS")){
            gameMachine = new NintendoSwitch();
        }
        gameMachine.playGame(gameType,gameName);
    }
}
