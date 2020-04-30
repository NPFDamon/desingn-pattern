package com.cn.builder.adapter.interfaces.impl;

import com.cn.builder.adapter.interfaces.PlayStation;

public class PlayStation4 implements PlayStation {
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("NS") || gameType.equals("Xbox")){
            System.out.println("PlayStation can not play other platform Game!");
        }else {
            System.out.println("Run game " + gameType + "-platform " +gameName);
        }
    }
}
