package com.cn.flyweight;

import java.util.HashMap;

/***
 * 享元工厂
 */
public class Steam {
    private static final HashMap<String, SteamGame> gameHashMap = new HashMap<>();

    public static Game getGame(String gameName) {
        if (gameName == null) {
            throw new RuntimeException("Game can not be null!");
        }
        SteamGame game = gameHashMap.get(gameName);
        if (game == null) {
            System.out.println("You don't have game: " + gameName + ",You should buy game: " + gameName);
            game = new SteamGame(gameName);
            gameHashMap.put(gameName, game);
        } else {
            System.out.println("You already have game: " + gameName + ",you can play it now!");
        }
        return game;
    }
}
