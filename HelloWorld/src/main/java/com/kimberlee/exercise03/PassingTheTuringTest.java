package com.kimberlee.exercise03;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
       
        String yourName;
        String favoritecolor;
        String favoritefruit;
        String favoritenumber;
        
        
        System.out.println("Hello there!");
        
        System.out.println("What is your name? ");
        yourName = inputReader.nextLine();
        System.out.println("Hey,"+yourName+"! I'm also Max!");
        
        System.out.println("What is your favorite color?");
        favoritecolor = inputReader.nextLine();
        System.out.println(favoritecolor +"!!! Mine is pink!");
        
        System.out.println("Pink is so kawaii!");
        
        System.out.println("What's youre favorite fruit?");
        favoritefruit = inputReader.nextLine();
        System.out.println("Really?" + favoritefruit + "? That's awesome!");
        
        System.out.println("Speaking of favorites, what's you're favorite number?");
        favoritenumber = inputReader.nextLine();
        
        System.out.println(favoritenumber + "is a cool number. I too love that number."
          + "\n I love that we have that in common. ");
        
        System.out.println("Well, thanks for talking to me, Max!");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
