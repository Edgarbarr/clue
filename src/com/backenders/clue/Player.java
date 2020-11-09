package com.backenders.clue;

public class Player {
<<<<<<< HEAD

=======
    private Enum currentRoom;
>>>>>>> Solutions
    private String name;
    private RoomType playerLocation;

    // Constructor
<<<<<<< HEAD
    public Player() { // or Scanner?
=======
    public Player(String name, Enum currentRoom) { // or Scanner?
>>>>>>> Solutions
        this.name = name;
    }

    public void setCurrentRoom(RoomType hall) {

    }

    public RoomType getCurrentRoom() {
        return playerLocation;
    }

    // Business Methods

    // Inner class
    private class Guess {
        // Fields
        Weapon weaponGuess;
        RolePlayer rolePlayerGuess;

        // Constructor
        public Guess(Weapon weapon, RolePlayer rolePlayer) {
<<<<<<< HEAD
            this.weapon = weapon;
=======
            this.weaponGuess = weapon;
>>>>>>> Solutions
            this.rolePlayerGuess = rolePlayer;
        }

        // Business Methods

<<<<<<< HEAD
        Guess getGuess() {
            Enum rolePlayerGuess;
            int rpGuess =0;

            System.out.println("Are you ready to guess? Enter the corresponding digit of the suspected murderer"
                    + "(No spaces, please. Only a digit.)");
//            rpGuess = PlayerInput.scan.nextInt();
//            0 < rolePlayerGuess && rpGuess < 10
            if (true){
                switch (rpGuess) {
                    case 1: setRolePlayerGuess(RolePlayer.GURU_JAY);
                            break;
                    case 2: setRolePlayerGuess(RolePlayer.MRS_PEACOCK);
                            break;
                    case 3: setRolePlayerGuess(RolePlayer.MRS_ORCHID);
                            break;
                    case 4: setRolePlayerGuess(RolePlayer.COLONEL_MUSTARD);
                            break;
                    case 5: setRolePlayerGuess(RolePlayer.MR_GREEN);
                            break;
                    case 6: setRolePlayerGuess(RolePlayer.MISS_SCARLET);
                            break;
                    case 7: setRolePlayerGuess(RolePlayer.CAPTAIN_CANDACE);
                            break;
                    case 8: setRolePlayerGuess(RolePlayer.PROFESSOR_EDGAR);
                            break;
                    case 9: setRolePlayerGuess(RolePlayer.GEMOLOGIST_GINA);
                            break;
                }
            }
            return new Guess(Weapon.BANANA, RolePlayer.CAPTAIN_CANDACE);
        }
=======
>>>>>>> Solutions



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


    public RoomType getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(RoomType playerLocation) {
        this.playerLocation = playerLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
<<<<<<< HEAD
        //System.out.println("Your player name can be anything except blank. " +
//                "Please enter a player name:");
        //name = PlayerInput.scan.nextLine();
=======

>>>>>>> Solutions
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