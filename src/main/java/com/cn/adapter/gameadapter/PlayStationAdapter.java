package com.cn.adapter.gameadapter;

import com.cn.adapter.interfaces.GameMachine;
import com.cn.adapter.interfaces.PlayStation;
import com.cn.adapter.interfaces.impl.NintendoSwitch;
import com.cn.adapter.interfaces.impl.XboxOneX;

/**
 * ps适配器，让ps4可以玩xbox和ns游戏
 */
public class PlayStationAdapter implements PlayStation {
    GameMachine gameMachine;
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("Xbox")){
            System.out.println("PS Adapter make you can play Xbox game! Buy it!!");
            gameMachine = new XboxOneX();
        }else if(gameType.equals("NS")){
            System.out.println("PS Adapter make you can play NS game! Buy it!!");
            gameMachine = new NintendoSwitch();
        }
        gameMachine.playGame(gameType,gameName);
    }
}
