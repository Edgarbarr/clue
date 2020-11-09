package com.backenders.clue;

import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

class GameMap {
    private Map<Room, Map<String, Room>> gameMap;

    public GameMap() {
        gameMap = new HashMap<>();
    }
    public void setRoom(Room room, Exit ...exits) {
        Map<String, Room> exitsMap = new HashMap<>();
        Arrays.stream(exits).sequential().forEach(exit -> exitsMap.put(exit.getDirection(),exit.getRoom()));
        gameMap.put(room, exitsMap);
    }
    Map getExits(Room room) {
        return gameMap.get(room);
    }

    void printMap() {
        Formatter map = new Formatter();
        map.format("#################################################\n");
        map.format("#               #               #               #\n");
        map.format("#               #               #               #\n");
        map.format("#%15s"+"#%15s"+"#%15s#\n", Room.values()[6], Room.values()[7], Room.values()[8]);
        map.format("#               #               #               #\n");
        map.format("#               #               #               #\n");
        map.format("#################################################\n");
        map.format("#               #               #               #\n");
        map.format("#               #               #               #\n");
        map.format("#%15s"+"#     CLUE      #################\n", Room.values()[3]);
        map.format("#               #               #               #\n");
        map.format("#               #               #               #\n");
        map.format("#################################################\n");
        map.format("#               #               #               #\n");
        map.format("#               #               #               #\n");
        map.format("#%15s"+"#%15s"+"#%15s#\n", Room.values()[0], Room.values()[1], Room.values()[2]);
        map.format("#               #               #               #\n");
        map.format("#               #               #               #\n");
        map.format("#################################################\n");
        System.out.println(map);



    }
}
