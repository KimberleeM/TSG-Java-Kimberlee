package com.kimberlee.exercise04;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Guess a number I'm thinking:");
      
                  
        int Nope = scan.nextInt();
        double correctNum = Math.round(Math.random() * 101);

  
        // if (operand OPERATOR operand)
        if (Nope <= correctNum) {
            System.out.println("Too low!");
        }
        if (Nope == correctNum){
            System.out.println(+Nope+ "?" + " Yeah, just right! ");
        }
        
        if (Nope >= correctNum){
            System.out.println("Too high!");
        }
        System.out.println(correctNum);
    }
}
