package com.kimberlee.exercise04;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class TriviaNight {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int score =0;
        

        System.out.println("It's TRIVIA NIGHT! Are you ready?!\n");
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the lowest level programming language?");
        System.out.println("1) Source code" + "     " + "2)Assembly language\n"
                + "3) C#" + "           " + "4)Machine code");
        System.out.println("Your answer: ");
        
         int answer1 = scan.nextInt();
        if (answer1 == 4) {
            score++;
        }

        System.out.println("SECOND QUESTION!");
        System.out.println("Website security CAPTCHA forms are descended from "
                + "work of?");
        System.out.println("1) Grace Hopper" + "    " + "2)Alan Turing \n"
                + "3) Charles Babbage" + "      " + "4)Larry Page");
        System.out.println("Your answer: ");
        
        int answer2 = scan.nextInt();
        if (answer2 == 2) {
             score++;
        }

        System.out.println("LAST QUESTION!");
        System.out.println("Which of these sci-fi ships was once slated for a "
                + " full-size replica in Las Vegas?");
        System.out.println("1) Serenity" + "    " + "2) The Battlestar Galactica\n"
                + "3) The USS Enterprise" + "    " + "4)The Millennium"
                + " Flacon");
        System.out.println("Your answer: ");
        
        int answer3 = scan.nextInt();
        if (answer3 == 3) {
             score++;
    }
        System.out.println("\nScore: " + score + "\n ");
       
}

}
