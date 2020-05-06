package com.cn.template;

/**\
 * 模板模式；一个抽象类公开定义了执行他的方法，他的子类可以按需求重新覆盖方法实现
 * 定义一个操作中算法的骨架，而将一些步骤延迟到子类中。
 */
public class Test {
    public static void main(String[] args){
        PlayGame playGame = new PLayPCGame();
        playGame.play("Minesweeper");

        PlayGame playGame1 = new ConsoleGame();
        playGame1.play("Ring Fit Adventure");

        PlayGame playGame2 = new MobilePhoneGame();
        playGame2.play("Pokémon");
    }
}
