package com.kimberlee.assessment01;

/**
 *
 * @author Max
 */
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//allows users to type into the console

        System.out.println("What is your dog's name?");
        String name = input.nextLine();//allows user to type out a name into the console
        System.out.println("Well then, I have this highly reliable report on " + name); //input displays sentence including name user inputs
        System.out.println("Esquire's prestigious background right here.");
        System.out.println(name + " Esquire is:");

        //claims the variable i displays the min value (0)  
        int max = 100; // claims the variable max displays the max value (100) 
        String[] dogNames = {"visla", "akita", "americanBulldog", "americanFoxhound", "tosa"}; //arrays of dog breed
        for (int j = 0; j < dogNames.length -1; j++) { //declared variable for j and gave it value/ regenerates random dog breeds, but doesnt count tosa/dog breed names increments by 1
            int m = getRandom(max);//maximum percentage(below 100) for each dog breed
            System.out.println(dogNames[j] + " : " + m + "%"); //displays dog breed/random percentage below 100/ percentage symbol
            max = max - m; //the maximum subtracts a number in 100 so it doesn't pass 100 for each random percentage 
        }

        System.out.println("tosa" + " : " + max + "%"); //whatever is left over will be the percentage for the last dog breed aka tosa 
        System.out.println("Wow, that's QUITE the dog!");
    }

    public static int getRandom(int max) {
        if (max == 0) { //if the total percentage reaches 100 the default value becomes 0 
            return 0;//returns value
        }
        Random rand = new Random();//randomizes values 
        return rand.nextInt(max + 1);//increments percentage below 100 by 1

    }

}
