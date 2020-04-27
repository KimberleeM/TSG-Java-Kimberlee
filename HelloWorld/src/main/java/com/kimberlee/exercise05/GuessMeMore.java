package com.kimberlee.exercise05;

/**
 *
 * @author Max
 */
import java.util.Scanner;


public class GuessMeMore {
    public static void main(String[] args) {
           Scanner scan = new Scanner (System.in);
        
        System.out.println(">I've chosen a number between -100 and 100. Bet"
                + " you can't guess it!");
      
                  
        int Nope = scan.nextInt();
        double correctNum = Math.round(Math.random() * 100);
        double correctN = Math.round(Math.random() * -100);
        

  
        // if (operand OPERATOR operand)
        if (Nope < correctNum) {
            System.out.println("Too low!");
        }
        if (Nope == correctNum){
            System.out.println(+Nope+ "?" + " Yeah, just right! ");
        }
        
        if (Nope > correctNum){
            System.out.println("Too high!");
        }
        System.out.println(correctNum);
    }
}
    

