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
        float cog;
        float cot;

        //declare String variables for height and width input
        String stringHeight;
        String stringWidth;
        String stringcog;
        String stringcot;

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
        System.out.println("Cost of glass: ");
        stringcog = myScanner.nextLine();
        System.out.println("Cost of trim: ");
        stringcot = myScanner.nextLine();

        

        //convert String values of height and width to float values 
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        cog = Float.parseFloat(stringcog);
        cot = Float.parseFloat(stringcot);

        //calculate the area of window 
        areaOfWindow = height * width;

        //calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        //calculate the total cost - use a hard-coded value for material cost 
        cost = ((cog * areaOfWindow) + (cot * perimeterOfWindow));
        
        //display the results to the user 
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow );
        System.out.println("Total Cost = " + cost);

        
        //testing values: height = 2. widht = 3, cog = 3.50,
        //at the end, test 2.25 in the trim cost and make sure total cost is 43.50
    }
}
 