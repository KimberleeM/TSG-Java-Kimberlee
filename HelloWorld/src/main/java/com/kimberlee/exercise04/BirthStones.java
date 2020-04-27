package com.kimberlee.exercise04;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class BirthStones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int birthstones = scan.nextInt();

        if (birthstones == 1) {
            System.out.println("January's birthstone is Garnet");

        } else if (birthstones == 2) {
            System.out.println("February's birthstone is amethyst");
        } 
        else if (birthstones == 3) {
            System.out.println("March's birthstone is Aquamarine");
        } 
        else if (birthstones == 4) {
            System.out.println("April's birthstone is diamond");
        }
        else if (birthstones == 5) {
            System.out.println("May's birthstone is emerald");
            
        }
        else if (birthstones == 6){
            System.out.println("June's birthstone is pearl");
        }
        else if (birthstones == 7){
            System.out.println("July's birthstone is ruby");
        }
        else if (birthstones == 8){
            System.out.println("August's birthstone is periodt");
        }
        else if (birthstones == 9){
            System.out.println("September's birthstone is sapphire");
            
        } 
        else if (birthstones == 10){
            System.out.println("October's birthstone is opal");
        }
        else if (birthstones == 11){
            System.out.println("November's birthstone is topaz");
        }
        else if (birthstones ==12){
            System.out.println("December's birthstone is turquoise");
        }
        
        else {
            System.out.println("I think you must be confused," + birthstones + 
                    " doesn't match a month.");
        }

      }
    }
