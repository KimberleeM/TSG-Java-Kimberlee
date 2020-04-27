package com.kimberlee.exercise05;

/**
 *
 * @author Max
 */
import java.util.Random;

public class HighRoller {
    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(6)+1;
        
        System.out.println("TIME TO ROOOOOLLLLL THE DICE!");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1){
            System.out.println("You rolled a critical failure");
        }
           
                
     }
    
}
