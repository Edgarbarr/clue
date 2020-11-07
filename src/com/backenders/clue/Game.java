package com.backenders.clue;

import java.util.List;

public class Game {
    private RolePlayer rolePlayers;
    private Weapon weapons;
    private List<Room> rooms; //can be enum or class
    private Clue clue; //should we have a clue class or have clues in Game
    private Solution solution;
    private Player hp;
    private Stories stories;
//    private Thread bRoleThread;

    public void start(){
        System.out.println("start");
    }
    public void displayRules() {

    }
    public void generateGame() {
        Room room = new Room();
        rooms = Room.generateRooms();
    }
    askPlayerGuess(){};
    checkSolutions(){};
    offerMoveToPlayer();
    listRolePlayers(){};
    listRooms(){};
    listWeapons(){};

//    method(Stories.clueTemplates, WeaponList, RolePlayer);// chose how you want to implement clue making
}
