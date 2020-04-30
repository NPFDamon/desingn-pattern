package com.cn.builder.adapter.gameadapter;

import com.cn.builder.adapter.interfaces.GameMachine;
import com.cn.builder.adapter.interfaces.PlayStation;
import com.cn.builder.adapter.interfaces.impl.NintendoSwitch;
import com.cn.builder.adapter.interfaces.impl.XboxOneX;

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
