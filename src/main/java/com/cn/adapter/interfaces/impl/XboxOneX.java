package com.cn.adapter.interfaces.impl;

import com.cn.adapter.interfaces.Xbox;

public class XboxOneX implements Xbox {
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("PS")||gameType.equals("NS")){
            System.out.println("Xbox can not play other platform Game!");
        }else {
            System.out.println("Run game " + gameType + "-platform " +gameName);

        }
    }
}
