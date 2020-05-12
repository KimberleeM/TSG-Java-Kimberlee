package com.kimberlee.assessment01;

/**
 *
 * @author Max
 */
import java.util.Scanner; //this allows the user to input answers

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//allows what user input what they 
        //need to into the console to be diplayed in the out 

        System.out.println("What is your age?");//is diplayed in the output;console log
        String ages = input.nextLine();
        int minB, maxB, totalM;//claim variables
        int age = Integer.parseInt(ages); //converts text into numbers(integers)

        totalM = 220 - age;//total amount of beats per min minus(anything 220) their age 
        minB = (int) (totalM * (.5));//setting values for min beats per min
        maxB = (int) (totalM * .85);//setting values for max beats per min

        System.out.println("Your maximum heart rate should be " + totalM + " beats per min");
        System.out.println("Your target HR Zone is " + minB + "-" + maxB + " beats per minute");

    }

}


