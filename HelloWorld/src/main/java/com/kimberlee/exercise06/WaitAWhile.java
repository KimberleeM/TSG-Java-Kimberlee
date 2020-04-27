package com.kimberlee.exercise06;

/**
 *
 * @author Max
 */
public class WaitAWhile {

    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiiiiittle longer"
                    + " .....");
            timeNow++; // Time Passes

        }
        System.out.println("Oh. It's " + timeNow + " o 'clock.");
        System.out.println("Guess I should go to bed ...");
    }

}
