package com.kimberlee.exercise08;

import java.util.Random;

/**
 *
 * @author Max
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = color(); //call color method here
        String animal = animal(); //call animal method again here
        String colorAgain = color(); //call color method again here
        int weight = number(200,5); //call number method;
        //with a range between 5 - 200
        int distance = number(20,10); 
        //with a range between 10-20
        int number = number(20000,10000); //call number method,
        // with a range between 10000 - 20000
        int time = number(6,2); // callnumber method,
        //with a range between 2-6
        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + color + ", "
        + weight + "lb " + " miniature " + animal 
                +" for over " + distance + " miles!!");
                
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain 
         + " poppies for nearly " + time + " hours until it left me alone!");
        
        System.out.println("\n It was QUITE the experience, let me telle you!");
    }
    
    //???Method 1???
    public static String color() {
        Random randomizer = new Random();
        
        int color = randomizer.nextInt(5);
        
        switch(color){
            case 0: return "orange";
            case 1: return "pink";
            case 2: return "blue";
            case 3: return "green";
            default: return "purple";
                    
                   
        }
    }
         //???Method 2???
         

    public static String animal(){
        Random randomizer = new Random();
        
        int animal = randomizer.nextInt(5);
        
        switch(animal){
            case 0: return "elephant";
            case 1: return "rabbit";
            case 2: return "tiger";
            case 3: return "giraffe";
            default: return "wolf";
            
        }
        
    }
   
    //???Method 3???
    
    public static int number(int max, int min){
        Random randomizer = new Random();
        
        int number = randomizer.nextInt(max-min)+1+min;
        return number;
        
        
        
        
    }
    
    
    
}

