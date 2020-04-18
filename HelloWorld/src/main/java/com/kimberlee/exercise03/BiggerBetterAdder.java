package com.kimberlee.exercise03;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("System enter number :");
        int number = input.nextInt();
        System.out.print("System enter number :");
        int number2 = input.nextInt();
        System.out.print("System enter number :");
        int number3 = input.nextInt();
     
        int number4 = number + number2 + number3;
        
        System.out.println(number + "+" + number2 + "+" + number3 + " = " + number4 );
    }
    
}

