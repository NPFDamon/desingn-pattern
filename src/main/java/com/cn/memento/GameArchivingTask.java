package com.cn.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人角色；负责保存备忘录；可以存储一个或多个对象，只负责存储，不能修改对象
 */
public class GameArchivingTask {
    private final List<Game> list = new ArrayList<>();

    public void add(Game game) {
        list.add(game);
    }

    public Game getGame(int index) {
        return list.get(index);
    }
}
