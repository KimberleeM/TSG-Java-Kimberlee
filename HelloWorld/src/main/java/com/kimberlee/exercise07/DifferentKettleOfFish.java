package com.kimberlee.exercise07;

/**
 *
 * @author Max
 */
public class DifferentKettleOfFish {
    public static void main(String[] args) {
        
        int fish = 1;
        while(fish < 11){
            if(fish == 3){
                System.out.println("RED Fish!");
            }else if (fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish +" fish!");
            }
            fish++;
        }
    }
}
