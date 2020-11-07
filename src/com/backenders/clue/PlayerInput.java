package com.backenders.clue;

import java.util.Scanner;

public class PlayerInput {
    public static Scanner sc = new Scanner(System.in);//not done

    int getPlayerInput() {
       return sc.nextInt(); //should be string
    }
}
