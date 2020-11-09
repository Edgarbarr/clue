package com.backenders.clue;

public class Room {
    private RoomType roomType;
    private RoomExits roomExits;

    public Room(RoomType roomType, RoomExits roomExits) {
        this.roomType = roomType;
        this.roomExits = roomExits;
    }

    public String getRoom() {
        return this.roomType.name();
    }

    public int getValue() {
        return this.roomExits.getValue();
    }

    public String toString() {
        this.roomType.toString();
        String var10000 = this.getRoom();
        return "You are in " + var10000 + " there are " + this.getValue() + " exits in this room.";
    }
}