package com.backenders.clue;

public class Player {
    private Enum currentRoom;
    private String name;

    // Constructor
    public Player(String name, Enum currentRoom) { // or Scanner?
        this.name = name;
    }

    // Business Methods

    // Inner class
    private class Guess {
        // Fields
        Weapon weaponGuess;
        RolePlayer rolePlayerGuess;

        // Constructor
        public Guess(Weapon weapon, RolePlayer rolePlayer) {
            this.weaponGuess = weapon;
            this.rolePlayerGuess = rolePlayer;
        }

        // Business Methods




        // Accessor Methods
        public Weapon getWeaponGuess() {
            return weaponGuess;
        }

        public void setWeaponGuess(Weapon weapon) {
            this.weaponGuess = weapon;
        }

        public RolePlayer getRolePlayerGuess() {
            return rolePlayerGuess;
        }

        public void setRolePlayerGuess(RolePlayer rolePlayer) {
            this.rolePlayerGuess = rolePlayer;
        }
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isBlank()){
            System.out.println("No blanks allowed. Please enter a player name:");
        }
        else{
            this.name = name;
        }
    }

    public Enum getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Enum currentRoom) {
        this.currentRoom = currentRoom;
    }
}