package com.cn.adapter.interfaces.impl;

import com.cn.adapter.gameadapter.NSAdapter;
import com.cn.adapter.interfaces.Switch;

public class NSSwitchWithPlugIn implements Switch {
    NSAdapter nsAdapter = new NSAdapter(new PlayStation4());
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("PS")){
            nsAdapter.playGame(gameType,gameName);
        }else if(gameType.equals("Xbox")){
            System.out.println("NS can not play Xbox platform Game!");
        }else {
            System.out.println("Run game " + gameType + "-platform " +gameName);
        }
    }
}
