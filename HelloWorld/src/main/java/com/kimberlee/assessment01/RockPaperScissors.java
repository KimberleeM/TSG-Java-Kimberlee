package com.kimberlee.assessment01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        int won = 0, tie = 0, lose = 0;//claimed variables for scores starts at 0
        boolean keepPlaying = true;// allows user to keep playing

        while (keepPlaying == true) { //while loop allows user to play another round 
            int loop = getUserInput1to10(); //allows user to play up to 10 games no more 
            for (int a = 0; a < loop; a++) { //need to place score at 0 
                int input = getUserInputRockPaperScissors();//user inputs their pick
                System.out.println("You picked " + stringName(input));//generates users pick(rock/paper/scissor)

                int rand = getRand(); //generates option from 1-3
                System.out.println("The computer picked " + stringName(rand));//comp displays random pick 
                switch (input) {
                    case 1:
                    //rock // if user chooses 1 it'll display rock
                    switch (rand) {
                        case 1:
                            //rock //if comp chooses 1 randomly
                            tie++; // it'll be a tie and the tie score increments by 1
                            System.out.println("Its a tie!!!");//prints into output
                            continue; //game proceeds
                        case 2:
                            //paper //comp randomly picks option 2
                            lose++;//lose score increments by 1
                            System.out.println("You Lose!!!"); //displays into output
                            continue;//game proceeds
                        default:
                            //scissor //comp chooses 3
                            won++;//win score increments by 1
                            System.out.println("You Won!!!");//displays into output
                            continue;//game proceeds
                    }

                    case 2:
                    //paper //if user chooses 2
                    switch (rand) {
                        case 1:
                            //rock //comp randomly chooses 1 for rock
                            won++;
                            System.out.println("You Won!!!");
                            continue;
                        case 2:
                            //paper //comp chooses 2 for paper
                            tie++;
                            System.out.println("Its a tie!!!");
                            continue;
                        default:
                            //scissor //comp randomly chooses 3 scissor
                            lose++;
                            System.out.println("You Lose!!!");
                            continue;
                    }

                    case 3:
                        //scissor //if user chooses option 3
                        switch (rand) {
                            case 1:
                                //rock //comp randomly chooses 1
                                lose++;
                                System.out.println("You lose!!!");
                                continue;
                            case 2:
                                //paper //comp randomly chooses 2
                                won++;
                                System.out.println("You Won!!!");
                                continue;
                            default:
                                //scissor //comp randomly chooses 3
                                tie++;
                                System.out.println("Its a tie!!!");
                                continue; //break
                        }
                    default:
                        break;
                }
            }
            System.out.println("\n\n"); // seperates score 
            System.out.println("Score "); 
            System.out.println("Win :" + won); //displays score for the win amount
            System.out.println("Lose :" + lose);//displays score for the loss amount
            System.out.println("Tie :" + tie); //displays tie score for the tie amount
            won = 0;
            lose = 0;
            tie = 0;
            
            keepPlaying = getUserInputBoolean();//askes user if they would like to continue playing 

        }

        System.out.println("Thank you for playing");//dispays in output after user refuses to continue playing

    }

    public static String stringName(int n) { 
        if (n == 1) { //if user choose 1 it returns rock name
            return "Rock";
        } else if (n == 2) {//if user chooses 2 it returns paper name
            return "Paper";
        }
        return "Scissor";//if user chooses 3 it returns scissor name 
    }

    public static int getUserInputRockPaperScissors() { /// 1-3
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What do you want to pick? Input 1 for Rock, 2 for Paper, 3 for Scissors :");
        int num = keyboard.nextInt();
        if (num > 3 || num < 1) { //chooses between three options 1/2/3
            return 1;
        }
        return num;
    }

    public static boolean getUserInputBoolean() { /// return true or false
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Do you want to play again? (1)Yes (2)No :");
        int num = keyboard.nextInt();
        if (num == 1) { //if user chooses 1 then the game starts over 
            return true;
        }
        return false; //if user picks 2 then game displays"thanks for playing" and ends
    }

    public static int getUserInput1to10() { /// return 1-10 if number >10 or number <0 number =2
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter how many rounds you would like to play :");
        int num = keyboard.nextInt();
        if (num > 10 || num < 1) { //displays how many rounds user would like to play min rounds 1 (min) 10(max)
            num = 2; 
        }
        return num;
    }

    public static int getRand() {// returns a number from 1-3 / comp chooses randomly 
        Random rand = new Random();
        return rand.nextInt(3) + 1;
    }

}
