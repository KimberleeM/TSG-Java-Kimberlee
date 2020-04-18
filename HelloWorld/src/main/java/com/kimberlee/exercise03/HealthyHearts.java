package com.kimberlee.exercise03;

/**
 *
 * @author Max
 */
import java.util.Scanner; 

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your age?"); 
        String ages = input.nextLine();
        int minB, maxB, totalM ; 
        int age = Integer.parseInt(ages); 
        
        totalM = 220-age; 
        minB = (int) (totalM *(.5)); 
        maxB = (int) (totalM*.85); 
        
        System.out.println("Your maximum heart rate should be " + minB + " beats per min" );
        System.out.println("Your target HR Zone is "+ minB +"-" + maxB + " beats per minute") ;
        
       }
    
}
