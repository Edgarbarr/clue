package com.backenders.clue;

public class Exit {
    private String direction;
    private Room room;

    public Exit(String direction, String room) {
        this.direction = direction;
        this.room = Room.valueOf(room);
    }
    String getDirection() {
        return direction;
    }
    Room getRoom() {
        return room;
    }
}
