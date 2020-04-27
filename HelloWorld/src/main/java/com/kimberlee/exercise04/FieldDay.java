package com.kimberlee.exercise04;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class FieldDay {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        String teamOne = "Red Dragons", teamTwo = "Dark Wizards", teamThree
                = "Moving Castles", teamFour = "Golden Snitches", teamFive
                = "Night Guards", teamSix = "Black Holes"; //.startsWith

        System.out.println("What's your last name? ");
        String input = inputReader.nextLine();

        if (input.startsWith("A")) {
            
            System.out.println("Aha! You're on the team" + teamOne + "!");
        }
        if (input.startsWith("C")) {
            
            System.out.println("Aha! You're on the team" + teamTwo + "!");
        }
        if (input.startsWith("E")) {
            
            System.out.println("Aha! You're on the team" + teamThree + "!");
        }
        if (input.startsWith("L")) {
            
            System.out.println("Aha! You're on the team" + teamFour + "!");
        }
        if (input.startsWith("R")) {
           
            System.out.println("Aha! You're on the team" + teamFive + "!");
        }
        if (input.startsWith("S")) {
           
            System.out.println("Aha! You're on the team" + teamSix + "!");
        }
    }
}
