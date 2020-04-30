package com.cn.builder.adapter.interfaces.impl;

import com.cn.builder.adapter.interfaces.Switch;

public class NintendoSwitch implements Switch {
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("PS")||gameType.equals("Xbox")){
            System.out.println("NS can not play other platform Game!");
        }else {
            System.out.println("Run game " + gameType + "-platform " +gameName);
        }
    }
}
