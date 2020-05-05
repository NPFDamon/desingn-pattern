package com.cn.memento;

/**
 * 备忘录模式；保存一个对象的某个状态，以便在适当的时候恢复
 * 在不破坏封装的前提下，捕获一个对象的内部状态，并在对象之外保存它
 *
 */
public class Test {

    public static void main(String[] args) {
        GameArchiving save = new GameArchiving();
        GameArchivingTask task = new GameArchivingTask();
        save.saveInfo("Super Mars Bro", "1-4", "save1");
        task.add(save.getNowInfoGame());
        save.saveInfo("Super Mars Bro", "2-4", "save2");
        task.add(save.getNowInfoGame());
        save.saveInfo("Super Mars Bro", "3-4", "save3");
        task.add(save.getNowInfoGame());

        System.out.println("Current state: " + save.toString());

        save.restore(task.getGame(0));
        System.out.println("First state: " + save.toString());

        save.restore(task.getGame(1));
        System.out.println("Second state: " + save.toString());


    }
}
