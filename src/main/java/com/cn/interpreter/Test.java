package com.cn.interpreter;

/**
 * 解释器模式；实现了一个表达式接口，该接口解释一个特点的上下文
 * 对于一些固定的文法构建一个句子的解释器
 */
public class Test {
    public static void main(String[] args){
        Game gta = new Game("GTA XII","PS-001","2022-02-03");
        Game superMarioBros = new Game("Super Mario Bros","NS-001","2022-02-03");
        Game warMachine = new Game("War Machine","Xbox-001","2022-02-03");

        Expression PS = new PlayStationExpression();
        Expression NS = new NSExpression();
        Expression Xbox = new XboxExpression();

        PS.interpreter(gta.getGameName(),gta.getGameIsbn());
        NS.interpreter(gta.getGameName(),gta.getGameIsbn());
        Xbox.interpreter(gta.getGameName(),gta.getGameIsbn());

        PS.interpreter(superMarioBros.getGameName(),superMarioBros.getGameIsbn());
        NS.interpreter(superMarioBros.getGameName(),superMarioBros.getGameIsbn());
        Xbox.interpreter(superMarioBros.getGameName(),superMarioBros.getGameIsbn());

        PS.interpreter(warMachine.getGameName(),warMachine.getGameIsbn());
        NS.interpreter(warMachine.getGameName(),warMachine.getGameIsbn());
        Xbox.interpreter(warMachine.getGameName(),warMachine.getGameIsbn());
    }
}
