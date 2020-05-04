package com.cn.interpreter;

/**
 * Xbox解释器
 */
public class XboxExpression implements Expression {
    @Override
    public void interpreter(String gameName, String isbn) {
        if (isbn.startsWith("Xbox")) {
            System.out.println(gameName + " is a xbox game!");
        }
    }
}
