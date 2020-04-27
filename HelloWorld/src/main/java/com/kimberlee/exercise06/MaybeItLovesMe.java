package com.kimberlee.exercise06;

/**
 *
 * @author Max
 */
public class MaybeItLovesMe {

    public static void main(String[] args) {

        int p = 13;
        double randomMax = Math.round(Math.random() * 89);

        System.out.println("Well here goes nothing...");

        while (p < 20) {
            System.out.println("It LOVES me!");
            System.out.println("It loves me NOT!");
            p++;
        }

        System.out.println("Awwww, bummer.");
        System.out.println("Oh wow! It really LOVES me!");


    }
}
