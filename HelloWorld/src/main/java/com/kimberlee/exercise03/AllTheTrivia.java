package com.kimberlee.exercise03;

/**
 *
 * @author Max
 */
import java.util.Scanner; 

public class AllTheTrivia {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
        
        String firstQuestion, secondQuestion, thirdQuestion, fourthQuestion;
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        firstQuestion = inputReader.nextLine();
        
        System.out.println ("Which planet is the only one that rotates clockwise"
                + " in our Solar System?" );
        secondQuestion = inputReader.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar "
                + "System is located on which planet? ");
        thirdQuestion = inputReader.nextLine();
        
        System.out.println("What is the most abundant element in the earth's "
                + " atomosphere?");
        fourthQuestion = inputReader.nextLine();
        
        
        System.out.println("Wow, 1,204 Gigabyes is a Mars!");
        System.out.print("I didn't know that the largest ever volcano was" +
                " discovered on Terabyte!\n");
        System.out.println("That's amazing that venus is the most abundant "
                + " element in the atmosphere...");
        System.out.print("Nitrogen is the only planet that rotates clockwise,"
                + " neat!");
                
    
    
    
    
    
    
    
    }
}
