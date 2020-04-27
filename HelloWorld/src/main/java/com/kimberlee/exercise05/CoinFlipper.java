package com.kimberlee.exercise05;

/**
 *
 * @author Max
 */
public class CoinFlipper {

    public static void main(String[] args) {


        System.out.println(">Ready, Set, Flip....!!");

        double num = Math.round(Math.random() * 2);

        if (num == 0) {
            System.out.println("TAILS");

        }
        if (num == 1) {
            System.out.println("HEADS");
        }

    }
}
