package com.kimberlee.exercise07;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class TwoForsAndTenYearsAgo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("What year would you like to count back from?");
        
        int year = userInput.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i +" years ago would be " + (year - i));
            
        }
        System.out.println("\n I can count backwards using a different way too...");
        
        for (int i = year; i >= year - 10; i--){
        System.out.println( (year - 1) + " years ago would be " + i);
        
         }
    }
    
    
}
