package com.cn.adapter.interfaces.impl;

import com.cn.adapter.gameadapter.PlayStationAdapter;
import com.cn.adapter.interfaces.PlayStation;

/**
 * 扩展适配器的PS4可以玩各平台游戏
 */
public class PlayStation4WithPlugIn implements PlayStation {
    PlayStationAdapter playStationAdapter = new PlayStationAdapter();
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("NS") || gameType.equals("Xbox")){
            playStationAdapter.playGame(gameType,gameName);
        }else {
            System.out.println("Run game " + gameType + "-platform " +gameName);
        }
    }
}
