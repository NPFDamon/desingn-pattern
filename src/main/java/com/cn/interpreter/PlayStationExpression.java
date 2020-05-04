package com.cn.interpreter;

/**
 * PS解释器
 */
public class PlayStationExpression implements Expression {

    @Override
    public void interpreter(String gameName, String isbn) {
        if (isbn.startsWith("PS")) {
            System.out.println(gameName + " is a PlayStation game!");
        }
    }
}
