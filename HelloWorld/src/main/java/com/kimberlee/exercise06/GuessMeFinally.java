package com.kimberlee.exercise06;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
                
        System.out.println(">I've chosen a number between -100 and 100. Bet"
                + " you can't guess it!");
      
                  
        int Nope = 0;
        double correctNum = Math.round(Math.random() * 100);
        double correctN = Math.round(Math.random() * -100);
        

  
      
        while(Nope != correctNum) {
           System.out.print("Your guess: ");
            Nope = scan.nextInt();
            if (Nope < correctNum) {
            System.out.println("Ha , nice try - Too low!");
            }
        
        
        if (Nope == correctNum){
            System.out.println("Wow, nice guess! That was it!");
        }
        if(Nope > correctNum){
            System.out.println("Too bad, way too high. Try again!");
        }
      
        }
    }
}
        
        
        
        
   
    

