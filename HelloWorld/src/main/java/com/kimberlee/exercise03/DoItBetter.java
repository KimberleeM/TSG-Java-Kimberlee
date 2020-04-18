package com.kimberlee.exercise03;
/**
 *
 * @author Max
 */
import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner (System.in);
        
        String miles, hotdogs, languages;
        
        System.out.println("How many miles can you run?");
        miles = inputReader.nextLine();
        int mi = Integer.parseInt(miles); 
        mi = (mi*2)+1; 
        System.out.println("I can run " +mi+"!!!!");
        
        System.out.println("How many hotdogs can you eat?");
        hotdogs = inputReader.nextLine();
        int hd = Integer.parseInt(hotdogs);
        hd =(hd*2)+1;
        System.out.println("I can eat " +hd+ "!!!");
        
        System.out.println("How many languages do you know?");
        languages = inputReader.nextLine();
        int lan = Integer.parseInt(languages);
        lan = (lan*2)+1;
        System.out.println("I know " +lan+ "!!!");
        
     }
    
}
