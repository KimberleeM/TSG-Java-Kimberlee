package com.kimberlee.exercise03;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner (System.in);
         
        String noun, adjective, anothernoun, number, anotheradjective, 
        pluralnoun, anotherpluralnoun, extrapluralnoun, verbpresenttense, 
        sameverbbutpastense;
        
        System.out.println("Let's play MAD LIBS!");
        
        System.out.println("I need a noun:" ); //1
        noun = inputReader.nextLine(); 
        
        System.out.println("Now an adjective:"); //2
        adjective = inputReader.nextLine();
        
        System.out.println("Another noun: "); //3
        anothernoun = inputReader.nextLine();
        
        System.out.println("And a number: "); //4
        number = inputReader.nextLine();
      
        System.out.println("Another adjective:"); //5
        anotheradjective = inputReader.nextLine();
         
        System.out.println("A plural noun:"); //6
        pluralnoun = inputReader.nextLine();
        
        System.out.println("Another one:"); //7
        anotherpluralnoun = inputReader.nextLine();
        
        System.out.println("One more:"); //8
        extrapluralnoun = inputReader.nextLine();
        
        System.out.println("A verb (infinitive form): "); //9
        verbpresenttense = inputReader.nextLine();
        
        System.out.println("Same verb (past participle): "); //10
        sameverbbutpastense = inputReader.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) *** ");
        System.out.println(noun +":" + " the " + adjective +" frontier" +". " +
        "These are the voyages of the starship " +  anothernoun + ".\n" 
        + "Its " + number + "-" + "year mission: to explore strange " + 
         anotheradjective + "  " +  pluralnoun + ","  + " to seek out \n"
        +anotheradjective + "  " + anotherpluralnoun + " and " + anotheradjective + 
         "  "+ extrapluralnoun + "," + " to boldly " + verbpresenttense + 
        " where no one has \n" 
        + sameverbbutpastense + " before" + ".");
        
      }
    
}
