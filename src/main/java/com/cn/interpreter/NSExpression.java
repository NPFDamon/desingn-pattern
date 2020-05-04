package com.cn.interpreter;

/**
 * NS解释器
 */
public class NSExpression implements Expression {

    @Override
    public void interpreter(String gameName, String isbn) {
        if (isbn.startsWith("NS")) {
            System.out.println(gameName + " is a NS game!");
        }
    }
}
