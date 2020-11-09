package com.backenders.clue;

public class Player {

    private String name;
    private RoomType playerLocation;

    // Constructor
    public Player() { // or Scanner?
        this.name = name;
    }

    public void setCurrentRoom(RoomType playerLocation) {

    }

    public RoomType getCurrentRoom() {
        return playerLocation;
    }

    // Business Methods

    // Inner class
    private class Guess {
        // Fields
        Weapon weapon;
        RolePlayer rolePlayerGuess;

        // Constructor
        public Guess(Weapon weapon, RolePlayer rolePlayer) {
            this.weapon = weapon;
            this.rolePlayerGuess = rolePlayer;
        }

        // Business Methods

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

        private boolean isInputValid(String guess) {
            boolean isValid = false;
            String inputPattern = "[1-9{1}]";   //"[1-9{1}],{1}[1-9{1}]";
            isValid = guess.matches(inputPattern);
            if (!isValid) {
                System.out.println("Please enter a digit comma digit with no spaces:");
            }
            else {
                isValid = true;
            }
            return isValid;
        }

        // Accessor Methods
        public Weapon getWeaponGuess() {
            return weapon;
        }

        public void setWeaponGuess(Weapon weapon) {
            this.weapon = weapon;
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

    // I THINK I created this thing called dependency injection with the scanner
    // so I'm supposed to pass the scan into the instantiation of Player in main
    // something like this? (But I don't really know?)
    // public static void main(String[] args) {
    //    PlayerInput scan = new PlayerInput(System.in);
    //    Player player = new Player(scan);
    //    Player.getName();
    public void setName(String name) {
        //System.out.println("Your player name can be anything except blank. " +
//                "Please enter a player name:");
        //name = PlayerInput.scan.nextLine();
        if (name.isBlank()){
            System.out.println("No blanks allowed. Please enter a player name:");
        }
        else{
            this.name = name;
        }
    }
}