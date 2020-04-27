package com.kimberlee.exercise04;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class YourLifeInMovies {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, let's play a game! What is your name?");
        String YourName = scan.nextLine();
        System.out.println("Okay " + YourName + " , when were you born?");
        int YearBorn = scan.nextInt();
        System.out.println("Well " + YourName + " ...");

        if (YearBorn <= 1975) {
            System.out.println(" that the original Jurassic Park release is closer "
                    + " to the first lunar landing than it is to today.");
        }
        if (YearBorn <= 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a "
                    + " decade ago?");
        }

        if (YearBorn <= 1995) {
            System.out.println("And that the first Harry Potter came "
                    + "out over 15 years ago.");
        }

        if (YearBorn <= 1985) {
            System.out.println("Also, that the Space Jam came out not last "
                    + "decade, but the one before THAT.");
        }
        if (YearBorn <=1965){
            System.out.println(" And that the MASH TV series has been "
                    + " around for almost half a century!");
        
        }
        
    }
}