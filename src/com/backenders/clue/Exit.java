package com.backenders.clue;

public class Exit {
    private String direction;
    private RoomType room;

    public Exit(String direction, String room) {
        this.direction = direction;
        this.room = RoomType.valueOf(room);
    }
    String getDirection() {
        return direction;
    }
    RoomType getRoom() {
        return room;
    }
}
