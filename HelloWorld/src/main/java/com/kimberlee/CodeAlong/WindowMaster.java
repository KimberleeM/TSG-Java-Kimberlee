package com.kimberlee.CodeAlong;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {

        //alt + shift + f
        //declare variables for height and width 
        float height;
        float width;

        //declare String variables for height and width input
        String stringHeight;
        String stringWidth;

        //declare other variables 
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        //declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        //get input from user 
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();

        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        //convert String values of height and width to float values 
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //calculate the area of window 
        areaOfWindow = height * width;
        
        //calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
    }
}
