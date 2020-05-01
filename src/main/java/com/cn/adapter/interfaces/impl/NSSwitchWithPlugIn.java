package com.cn.adapter.interfaces.impl;

import com.cn.adapter.gameadapter.NSAdapter;
import com.cn.adapter.interfaces.Switch;

/**
 * 适配器支持两种平台，成品可以自由选择是否适配
 */
public class NSSwitchWithPlugIn implements Switch {
    NSAdapter nsAdapter = new NSAdapter(new PlayStation4());
    public void playGame(String gameType, String gameName) {
        if(gameType.equals("PS")){
            //选择适配ps
            nsAdapter.playGame(gameType,gameName);
        }else if(gameType.equals("Xbox")){
            //选择不适配xbox,但适配器支持xbox
            System.out.println("NS can not play Xbox platform Game!");
        }else {
            System.out.println("Run game " + gameType + "-platform " +gameName);
        }
    }
}
